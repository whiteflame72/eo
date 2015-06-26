package com.eolinc.exception;

import java.io.PrintStream;
import java.io.PrintWriter;
import java.sql.Timestamp;
import java.util.Collection;
import java.util.Date;

/**
 * This is the base exception that other exceptions will extend.
 * This will maintain the rootcause of the exception.
 */
public class EOLException extends Exception
{
	
    private final static long serialVersionUID = 1L;

	private Integer errorCode=new Integer(0);
	private String reason;
	private Collection parameters;
	private Timestamp createTime;
	private Throwable rootCause;

	/**
	 * Empty constructor
	 */
	 public EOLException()
	 {
	 }
	/**
	 *
	 * @param message
	 * @param parameters
	 * @param rootCause
	 */
	 public EOLException(String message, Collection parameters, Throwable rootCause)
	 {
	     //super(formatMessage(message, parameters, rootCause));
	     super(message);
	     this.parameters = parameters;
	     this.rootCause = rootCause;
	     createTime = new Timestamp(System.currentTimeMillis());
	 }

	/**
	 *
	 * @param message
	 * @param parameters
	 * @param rootCause
	 * @return String
	 */
	 public static String formatMessage(String message, Collection parameters, Throwable rootCause)
	 {
	     Date createTime = new Date();
	     StringBuffer buff = new StringBuffer();
	     if(message != null)
	         buff.append(message).append(", ");
	     buff.append("Exception created " + createTime);
	     if(parameters != null && parameters.size() > 0)
	         buff.append(" with parameters: " + parameters);

	     return buff.toString();
	 }

	/**
	 *
	 * @param parameters
	 * @param rootCause
	 */
	 public EOLException(Collection parameters, Throwable rootCause)
	 {
	     this(null, parameters, rootCause);
	 }

	/**
	 *
	 * @param message
	 * @param parameters
	 */
	 public EOLException(String message, Collection parameters)
	 {
	     this(message, parameters, null);
	 }

	 /**
	  *
	  * @param rootCause
	  */
	 public EOLException(Throwable rootCause)
	 {
	     this(null, null, rootCause);
	 }

	 /**
	  *
	  * @param message
	  */
	 public EOLException(String message)
	 {
	     this(message, null, null);
	 }

	 /**
	  *
	  * @param message
	  * @param rootCause
	  */
	 public EOLException(String message, Throwable rootCause)
	 {
	     this(message, null, rootCause);
	 }

	 public void printStackTrace()
	 {
	     printStackTrace(System.err);
	 }

	 /**
	  *
	  * @param out
	  */
	 public void printStackTrace(PrintStream out)
	 {
	     if(rootCause != null)
	         rootCause.printStackTrace(out);
	     super.printStackTrace(out);
	 }

	 /**
	  *
	  * @param out
	  */
	 public void printStackTrace(PrintWriter out)
	 {
	     if(rootCause != null)
	         rootCause.printStackTrace(out);
	     super.printStackTrace(out);
	 }

	 /**
	  *
	  * @return Collection
	  */
	 public Collection getParameters()
	 {
	     return parameters;
	 }

	 /**
	  *
	  * @return Throwable
	  */
	 public Throwable getCause()
	 {
	     return rootCause;
	 }

	 /**
	  * This can maintain an error code specific to the Exception
	  * @return error code
	  */
	 public Integer getErrorCode(){
	 	return errorCode;
	 }

	 /**
	  * This can maintain an error code specific to the Exception errorCode.
	  * @param errorCode
	  */
	 public void setErrorCode(Integer errorCode){
	 	this.errorCode=errorCode;
	 }


	 /**
	  * get human readable reason for the Exception.
	  * @return String -- reason
	  */
	 public String getReason(){
	 	return reason;
	 }

	 /**
	  * set human readable reason.
	  *
	  * @param reason
	  */
	 public void setReason(String reason){
	 	this.reason=reason;
	 }

	 public Timestamp getCreateTime() {
		return createTime;
	}


}