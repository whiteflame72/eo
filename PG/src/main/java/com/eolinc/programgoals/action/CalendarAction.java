/*
 * COMPANY NAME: Education OnLine
 * COPYRIGHT
 * UNPUBLISHED WORK
 * ALL RIGHTS RESERVED
 * PROJECT NAME: Program Goals
 *
 */

package com.eolinc.programgoals.action;

import java.sql.Date;
import java.util.Calendar;

import org.apache.log4j.Logger;

import com.eolinc.action.BaseAction;
import com.eolinc.dao.BaseDao;
import com.eolinc.exception.EOLException;



public class CalendarAction extends BaseAction{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	protected BaseDao dao = new BaseDao();


	Logger log = Logger.getLogger(getClass().getName());

	public String tutoringToday;
	
	public String getTutoringToday() {
		return tutoringToday;
	}

	public void setTutoringToday(String tutoringToday) {
		this.tutoringToday = tutoringToday;
	}
 


	public String execute() throws Exception {


		log.info("Info: Entering Calendar Action");
		setActivityViewFields();

		return SUCCESS;
	}

	
	
	private void setActivityViewFields() throws EOLException {
		log.info("Info: Entering setActivityViewFields()");
		setTutoringToday("Tutoring at 4 PM");//Test
		//dao.findBy2Fields(program_goals_schedule, Profile_id, Session Stud ID, Activity_type, "T");
		//tutoringNext = dao.find();
		//assessmentsToday = dao.find();
		//assessmentsNext = dao.find();
		//homeworkToday = dao.find();
		//homeworkNext = dao.find();
		//testprepToday = dao.find();
		//testprepNext = dao.find();
	}

	private void setReportViewFields() throws EOLException {
	}

	private void setMessageViewFields() throws EOLException {
	}
	
	
	
	private java.sql.Date getSqlDate() {
		Calendar c = Calendar.getInstance();
		java.sql.Date jsqlD = new java.sql.Date(c.getTime().getTime());
		return jsqlD;
	}
	
	private int getToday() {
		Calendar c = Calendar.getInstance();
		return c.get(Calendar.DAY_OF_MONTH);
	}
	
	private int getCurrentMonth() {
		Calendar c = Calendar.getInstance();
		return c.get(Calendar.MONTH);
	}
	
	private int getCurrentYear() {
		Calendar c = Calendar.getInstance();
		return c.get(Calendar.YEAR);
	}

	
	private int getDayOfWeek() {
		int day = 0;
		Calendar c = Calendar.getInstance();
		day = c.get(Calendar.DAY_OF_WEEK);
		//Calendar returns Sun=1 & Sat=7, but we need Mon=1 & Sun=7
		day--;
		if (day <= 0) day = 7;		
		return day;
	}

}



