package com.eolinc.programgoals.parentinput;

import java.util.Date;
import java.util.Properties;

import javax.mail.Message;
import javax.mail.MessagingException;
import javax.mail.SendFailedException;
import javax.mail.Session;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeMessage;

import com.sun.mail.smtp.SMTPAddressFailedException;
import com.sun.mail.smtp.SMTPAddressSucceededException;
import com.sun.mail.smtp.SMTPSendFailedException;
import com.sun.mail.smtp.SMTPTransport;

/**
 * Demo app that shows how to construct and send an RFC822
 * (singlepart) message.
 *
 * XXX - allow more than one recipient on the command line
 *
 * This is just a variant of msgsend.java that demonstrates use of
 * some SMTP-specific features.
 *
 * @author Max Spivak
 * @author Bill Shannon
 */

public class SendMail {

	public static boolean SendMessage(String to, String subject, String text) {
		String from = null, 
		cc = null, bcc = null, url = null;
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

			/*
			 * Initialize the JavaMail Session.
			 */
			Properties props = System.getProperties();
			if (mailhost != null)
				props.put("mail." + prot + ".host", mailhost);
			if (auth)
				props.put("mail." + prot + ".auth", "true");

			// Get a Session object
			Session session = Session.getInstance(props, null);
			if (debug)
				session.setDebug(true);

			/*
			 * Construct the message and send it.
			 */
			Message msg = new MimeMessage(session);
			if (from != null)
				msg.setFrom(new InternetAddress(from));
			else
				msg.setFrom();

			msg.setRecipients(Message.RecipientType.TO,
					InternetAddress.parse(to, false));
			if (cc != null)
				msg.setRecipients(Message.RecipientType.CC,
						InternetAddress.parse(cc, false));
			if (bcc != null)
				msg.setRecipients(Message.RecipientType.BCC,
						InternetAddress.parse(bcc, false));

			msg.setSubject(subject);

			msg.setText(text);

			msg.setHeader("X-Mailer", mailer);
			msg.setSentDate(new Date());

			// send the thing off
			/*
			 * The simple way to send a message is this:
			 * Transport.send(msg);
			 *
			 * But we're going to use some SMTP-specific features for
			 * demonstration purposes so we need to manage the Transport
			 * object explicitly.
			 */
			SMTPTransport t = (SMTPTransport)session.getTransport(prot);
			try {
				if (auth)
					t.connect(mailhost, user, password);
				else
					t.connect();
				t.sendMessage(msg, msg.getAllRecipients());
			} finally {
				if (verbose)
					System.out.println("Response: " +
							t.getLastServerResponse());
				t.close();
			}

			System.out.println("\nMail was sent successfully.");

		} catch (Exception e) {
			/*
			 * Handle SMTP-specific exceptions.
			 */
			if (e instanceof SendFailedException) {
				MessagingException sfe = (MessagingException)e;
				if (sfe instanceof SMTPSendFailedException) {
					SMTPSendFailedException ssfe =
						(SMTPSendFailedException)sfe;
					System.out.println("SMTP SEND FAILED:");
					if (verbose)
						System.out.println(ssfe.toString());
					System.out.println("  Command: " + ssfe.getCommand());
					System.out.println("  RetCode: " + ssfe.getReturnCode());
					System.out.println("  Response: " + ssfe.getMessage());
				} else {
					if (verbose)
						System.out.println("Send failed: " + sfe.toString());
				}
				Exception ne;
				while ((ne = sfe.getNextException()) != null &&
						ne instanceof MessagingException) {
					sfe = (MessagingException)ne;
					if (sfe instanceof SMTPAddressFailedException) {
						SMTPAddressFailedException ssfe =
							(SMTPAddressFailedException)sfe;
						System.out.println("ADDRESS FAILED:");
						if (verbose)
							System.out.println(ssfe.toString());
						System.out.println("  Address: " + ssfe.getAddress());
						System.out.println("  Command: " + ssfe.getCommand());
						System.out.println("  RetCode: " + ssfe.getReturnCode());
						System.out.println("  Response: " + ssfe.getMessage());
					} else if (sfe instanceof SMTPAddressSucceededException) {
						System.out.println("ADDRESS SUCCEEDED:");
						SMTPAddressSucceededException ssfe =
							(SMTPAddressSucceededException)sfe;
						if (verbose)
							System.out.println(ssfe.toString());
						System.out.println("  Address: " + ssfe.getAddress());
						System.out.println("  Command: " + ssfe.getCommand());
						System.out.println("  RetCode: " + ssfe.getReturnCode());
						System.out.println("  Response: " + ssfe.getMessage());
					}
				}
				
			} else {
				System.out.println("Got Exception: " + e);
				if (verbose)
					e.printStackTrace();		
			}
			return false;
		}
		return true;
	}
}
