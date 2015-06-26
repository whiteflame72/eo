package com.eolinc.action;

import java.util.Map;

import org.apache.log4j.Logger;
import org.apache.struts2.interceptor.SessionAware;

import com.eolinc.exception.EOLException;
import com.opensymphony.xwork2.ActionSupport;

@SuppressWarnings("unchecked")
public abstract class BaseAction extends ActionSupport implements SessionAware{
	protected Logger logger = Logger.getLogger(getClass().getName());
	protected static final long serialVersionUID = 1L;
	protected Map session;

	protected String noSession() {
		addActionError(getText("error.noSession"));
		return "noSession";
	}
	
	protected String handleError(EOLException e, String errorMsg) {
		if (errorMsg != null) {
			String textMsg = getText(errorMsg);
			addActionError(textMsg);
			logger.error(textMsg);
		}			
		if (e == null) return ERROR;
		String msg = e.getMessage();
		if (msg != null && msg.length() > 0) {
			String textMsg = getText(msg);
			addActionError(textMsg);
			logger.error(textMsg);		
		}
		e.printStackTrace();
		return ERROR;
	}

	public String logout() {
		session.remove("UserName");
		session.remove("User");
		return "logout";
	}

	public Map getSession() {
		return session;
	}

	public void setSession(Map session) {
		this.session = session;
	}
}
