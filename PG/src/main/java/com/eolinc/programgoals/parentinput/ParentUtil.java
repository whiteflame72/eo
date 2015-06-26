package com.eolinc.programgoals.parentinput;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.text.MessageFormat;
import java.util.Date;
import java.util.Properties;

import javax.mail.Message;
import javax.mail.Session;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeMessage;

import com.sun.mail.smtp.SMTPTransport;

public class ParentUtil {

	public static boolean SendMessage(String to, String subject, String text) {
		String from = null, cc = null, bcc = null, url = null;
		String mailhost = "smtp.gmail.com";
		String mailer = "smtpsend";
		String protocol = null;
		String host = null;
		String user = "edu.online.test";
		String password = "edu*online";

		boolean debug = true;
		boolean verbose = false;
		boolean auth = true;
		String prot = "smtps";

		try {

			Properties props = System.getProperties();
			if (mailhost != null)
				props.put("mail." + prot + ".host", mailhost);
			if (auth)
				props.put("mail." + prot + ".auth", "true");

			Session session = Session.getInstance(props, null);
			if (debug)
				session.setDebug(true);

			Message msg = new MimeMessage(session);
			if (from != null)
				msg.setFrom(new InternetAddress(from));
			else
				msg.setFrom();

			msg.setRecipients(Message.RecipientType.TO, InternetAddress.parse(
					to, false));
			if (cc != null)
				msg.setRecipients(Message.RecipientType.CC, InternetAddress
						.parse(cc, false));
			if (bcc != null)
				msg.setRecipients(Message.RecipientType.BCC, InternetAddress
						.parse(bcc, false));

			msg.setSubject(subject);

			msg.setText(text);

			msg.setHeader("X-Mailer", mailer);
			msg.setSentDate(new Date());

			SMTPTransport t = (SMTPTransport) session.getTransport(prot);
			try {
				if (auth)
					t.connect(mailhost, user, password);
				else
					t.connect();
				t.sendMessage(msg, msg.getAllRecipients());
			} finally {
				if (verbose)
					t.close();
			}

		} catch (Exception e) {
			e.printStackTrace();

			return false;
		}
		return true;
	}

	private static String readFile(File file) {

		StringBuilder contents = new StringBuilder();

		try {

			BufferedReader input = new BufferedReader(new FileReader(file));
			try {
				String line = null;
				while ((line = input.readLine()) != null) {
					contents.append(line);
					contents.append(System.getProperty("line.separator"));
				}
			} finally {
				input.close();
			}
		} catch (IOException ex) {
			ex.printStackTrace();
		} catch (Exception exception) {
			exception.printStackTrace();
		}
		return contents.toString();		
	}
	
	private static String createMessage(String contents,String[] formats){
		Object []arguments = formats;		
		MessageFormat formatter = new MessageFormat(contents);
		String text = formatter.format(arguments);		
		return text;
	}
	
	public static String createMessage(String[] formats){
		String message = readFile(new File("ParentLetter.txt"));
		message = createMessage(message,formats);
		return message;
	}	
}
