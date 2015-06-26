/*
 * COMPANY NAME: Educational OnLine
 * COPYRIGHT                                       
 * UNPUBLISHED WORK
 * ALL RIGHTS RESERVED
 * PROJECT NAME: Program Goals
 * 
 */

package com.eolinc.programgoals.parentinput;

/**
 * @author Randy Alexander
 *
 */
public class InsertParent implements InsertParentInterface {
	
	private final static String TEACHER_PATTERN = "(name of teacher)";
	private final static String PARENT_PATTERN  = "(name of parent)";
	private final static String STUDENT_PATTERN  = "(name of student)";
	private final static String EMAIL_PATTERN = "(email address of parent)";
	private final static String PHONE_PATTERN = "(phone number of parent)";
	private final static String URL_PATTERN = "(link to form)";
	
	/* (non-Javadoc)
	 * 
	 */
	public InsertParent() {};
	
	/* (non-Javadoc)
	 * @see teacherQuestioner.InsertParentInterface#insertAll(java.lang.StringBuilder, java.lang.String)
	 */
		
	public String insertAll(String letterStr, String teacher, String parent, String student, String email, String phone, String url) {

		try {
			StringBuilder letter = new StringBuilder(letterStr);
			int index = letter.indexOf(TEACHER_PATTERN);
			letter.replace(index, index+TEACHER_PATTERN.length(), teacher);
			index = letter.indexOf(PARENT_PATTERN);
			letter.replace(index, index+PARENT_PATTERN.length(), parent);
			index = letter.indexOf(STUDENT_PATTERN);
			letter.replace(index, index+STUDENT_PATTERN.length(), student);
			index = letter.indexOf(EMAIL_PATTERN);
			letter.replace(index, index+EMAIL_PATTERN.length(), email);
			index = letter.indexOf(PHONE_PATTERN);
			letter.replace(index, index+PHONE_PATTERN.length(), phone);
			index = letter.indexOf(URL_PATTERN);
			letter.replace(index, index+URL_PATTERN.length(), url);

			return letter.toString();
			
		} catch (Exception e) {

			e.printStackTrace();
			return null;
		}

	}
	
	/* (non-Javadoc)
	 * @see teacherQuestioner.InsertParentInterface#insertParentName(java.lang.StringBuilder, java.lang.String)
	 */
	
	public String insertTeacherName(String letterStr, String teacher) {

		try {
			StringBuilder letter = new StringBuilder(letterStr);
			int index = letter.indexOf(TEACHER_PATTERN);
			letter.replace(index, index+TEACHER_PATTERN.length(), teacher);
			
			return letter.toString();
		} catch (Exception e) {
			
			e.printStackTrace();
			return null;
		}
	}

	/* (non-Javadoc)
	 * @see teacherQuestioner.InsertParentInterface#insertParentName(java.lang.StringBuilder, java.lang.String)
	 */
	
	public String insertParentName(String letterStr, String parent) {

		try {
			StringBuilder letter = new StringBuilder(letterStr);
			int index = letter.indexOf(PARENT_PATTERN);
			letter.replace(index, index+PARENT_PATTERN.length(), parent);
			
			return letter.toString();
		} catch (Exception e) {
			
			e.printStackTrace();
			return null;
		}
	}

	/* (non-Javadoc)
	 * @see teacherQuestioner.InsertParentInterface#insertParentName(java.lang.StringBuilder, java.lang.String)
	 */
	
	public String insertStudentName(String letterStr, String student) {

		try {
			StringBuilder letter = new StringBuilder(letterStr);
			int index = letter.indexOf(STUDENT_PATTERN);
			letter.replace(index, index+STUDENT_PATTERN.length(), student);
			
			return letter.toString();
		} catch (Exception e) {
			
			e.printStackTrace();
			return null;
		}
	}
	
	/* (non-Javadoc)
	 * @see teacherQuestioner.InsertParentInterface#insertParentEmail(java.lang.StringBuilder, java.lang.String)
	 */
	
	public String insertParentEmail(String letterStr, String email) {

		try {
			StringBuilder letter = new StringBuilder(letterStr);
			int index = letter.indexOf(EMAIL_PATTERN);
			letter.replace(index, index+EMAIL_PATTERN.length(), email);
			
			return letter.toString();
		} catch (Exception e) {
			
			e.printStackTrace();
			return null;
		}
	}


	/* (non-Javadoc)
	 * @see teacherQuestioner.InsertParentInterface#insertParentPhone(java.lang.StringBuilder, java.lang.String)
	 */
	
	public String insertParentPhone(String letterStr, String phone) {

		try {
			StringBuilder letter = new StringBuilder(letterStr);
			int index = letter.indexOf(PHONE_PATTERN);
			letter.replace(index, index+PHONE_PATTERN.length(), phone);
			
			return letter.toString();
		} catch (Exception e) {
			
			e.printStackTrace();
			return null;
		}
	}

	/* (non-Javadoc)
	 * @see teacherQuestioner.InsertParentInterface#insertParentPhone(java.lang.StringBuilder, java.lang.String)
	 */
	
	public String insertUrl(String letterStr, String url) {

		try {
			StringBuilder letter = new StringBuilder(letterStr);
			int index = letter.indexOf(URL_PATTERN);
			letter.replace(index, index+URL_PATTERN.length(), url);
			
			return letter.toString();
		} catch (Exception e) {
			
			e.printStackTrace();
			return null;
		}

	}

	public String insertAll(String letter, String teacher, String parent,
			String email, String phone) {
		// TODO Auto-generated method stub
		return null;
	}

}
