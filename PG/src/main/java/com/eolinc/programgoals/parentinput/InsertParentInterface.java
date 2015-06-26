/*
 * COMPANY NAME: Educational OnLine
 * COPYRIGHT                                       
 * UNPUBLISHED WORK
 * ALL RIGHTS RESERVED
 * PROJECT NAME: Program Goals
 * 
 */

package com.eolinc.programgoals.parentinput;

public interface InsertParentInterface {
	
	public String insertAll(String letter, String teacher, String parent, String email, String phone);

	public String insertTeacherName(String letter, String teacher);

	public String insertParentName(String letter, String parent);
	
	public String insertParentEmail(String letter, String email);
	
	public String insertParentPhone(String letter, String phone);

}
