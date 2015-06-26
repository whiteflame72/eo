/*
 * COMPANY NAME: Educational OnLine
 * COPYRIGHT                                       
 * UNPUBLISHED WORK
 * ALL RIGHTS RESERVED
 * PROJECT NAME: Program Goals
 * 
 */

package com.eolinc.programgoals.parentinput;


import java.io.File;

public class SendTeacherQuestionerToParent implements
SendTeacherQuestionerToParentInterface {

	private final static String PARENT_LETTER_FILE = "ParentLetter.txt";
	private final static String SUBJECT = "EOL Teacher Questioner";


	/**
	 * Constructor
	 * 
	 */
	public SendTeacherQuestionerToParent() {

	}

	/**
	 * Send the Teacher Questioner to the parent.
	 * Wrapper for the SendMail method
	 *  
	 * @param parentAddress - e-mail of the parent.
	 * @param teacher - teacher name
	 * @param parent - parent name
	 * @param phone - parent phone
	 * @returns a status of the sent e-mail.
	 */

	public boolean ModifyAndSendQuestioner(String parentAddress, String teacher, String parent, String student, String email, String phone, String url) {

		//Build a path to the directory
		//TODO need to decide where the Parent Letter will reside
		//probably don't want it in the WAR file.  That would make it difficult to change.
		
		String parentFilePath = new String();
		
		try {
			System.out.println("Operating system type =>"+ System.getProperty("os.arch"));
			
			if (System.getProperty("os.arch").equals("x86")) {
				StringBuilder filePath = new StringBuilder("C:");
				filePath.append(File.separator);
				filePath.append("home");
				filePath.append(File.separator);
				filePath.append("eoldevadmin");
				filePath.append(File.separator);
				filePath.append("apps");
				filePath.append(File.separator);
				filePath.append("jboss");
				filePath.append(File.separator);
				filePath.append("jboss-5.1.0.GA");
				filePath.append(File.separator);
				filePath.append("server");
				filePath.append(File.separator);
				filePath.append("default");
				filePath.append(File.separator);
				filePath.append("deploy");
				filePath.append(File.separator);
				filePath.append(PARENT_LETTER_FILE);
				parentFilePath = filePath.toString();	
				System.out.println("x 86 Parent Letter Path = " + parentFilePath);
			} else {	//Unix
				StringBuilder filePath = new StringBuilder(File.separator);
				filePath.append("home");
				filePath.append(File.separator);
				filePath.append("eoldevadmin");
				filePath.append(File.separator);
				filePath.append("apps");
				filePath.append(File.separator);
				filePath.append("jboss");
				filePath.append(File.separator);
				filePath.append("jboss-5.1.0.GA");
				filePath.append(File.separator);
				filePath.append("server");
				filePath.append(File.separator);
				filePath.append("default");
				filePath.append(File.separator);
				filePath.append("deploy");
				filePath.append(File.separator);
				filePath.append(PARENT_LETTER_FILE);
				parentFilePath = filePath.toString();	
				System.out.println("Unix Parent Letter Path = " + parentFilePath);
			}
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}



		File testFile = new File(parentFilePath);	
		FileToText instance = FileToText.getInstance();
		String body = instance.getContents(testFile);
		//System.out.print("Text = " + body);
		InsertParent letter = new InsertParent();
		String modifiedBody = letter.insertAll(body, teacher, parent, student, email, phone, url);
		//System.out.print("Modified Text = " + modifiedBody);
		return SendMail(parentAddress, SUBJECT, modifiedBody); 

	}




	/**
	 * Send the Teacher Questioner to the parent.
	 * Wrapper for the SendMail method
	 *  
	 * @param parentAddress - e-mail of the parent.
	 * @returns a status of the sent e-mail.
	 */

	public boolean SendQuestioner(String parentAddress) {
		File testFile = new File(PARENT_LETTER_FILE);
		FileToText instance = FileToText.getInstance();
		String body = instance.getContents(testFile);

		return SendMail(parentAddress, SUBJECT, body);
	}

	/**
	 * Send the e-mail.
	 * Wrapper for JavaMail
	 *  
	 * @param parentAddress - e-mail of the parent.
	 * @param subject - subject of the e-mail.
	 * @param text - body of the e-mail.
	 * 
	 * @returns a status of the sent e-mail.
	 */
	public boolean SendMail(String parentAddress, String subject, String text) {
		return SendMail.SendMessage(parentAddress, subject, text);
	}

}
