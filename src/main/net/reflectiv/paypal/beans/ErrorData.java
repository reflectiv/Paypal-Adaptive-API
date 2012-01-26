package net.reflectiv.paypal.beans;


import java.util.List;

import net.reflectiv.paypal.enums.ErrorCategory;
import net.reflectiv.paypal.enums.ErrorSeverity;

public class ErrorData {
	private ErrorCategory category;
	private String domain;
	private Integer errorId;
	private String exceptionID;
	private String message;
	private List<String> parameter; // lack of doc here
	private ErrorSeverity severity;
	private String subdomain;
	
	public String toString() {
		return message;
	}
	
	/**
	 * @return the category
	 */
	public ErrorCategory getCategory() {
		return category;
	}
	
	/**
	 * @param category the category to set
	 */
	public void setCategory(ErrorCategory category) {
		this.category = category;
	}
	
	/**
	 * @return the domain
	 */
	public String getDomain() {
		return domain;
	}
	
	/**
	 * @param domain the domain to set
	 */
	public void setDomain(String domain) {
		this.domain = domain;
	}
	
	/**
	 * @return the errorId
	 */
	public Integer getErrorId() {
		return errorId;
	}
	
	/**
	 * @param errorId the errorId to set
	 */
	public void setErrorId(Integer errorId) {
		this.errorId = errorId;
	}
	
	/**
	 * @return the exceptionID
	 */
	public String getExceptionID() {
		return exceptionID;
	}
	
	/**
	 * @param exceptionID the exceptionID to set
	 */
	public void setExceptionID(String exceptionID) {
		this.exceptionID = exceptionID;
	}
	
	/**
	 * @return the message
	 */
	public String getMessage() {
		return message;
	}
	
	/**
	 * @param message the message to set
	 */
	public void setMessage(String message) {
		this.message = message;
	}
	
	/**
	 * @return the parameter
	 */
	public List<String> getParameter() {
		return parameter;
	}
	
	/**
	 * @param parameter the parameter to set
	 */
	public void setParameter(List<String> parameter) {
		this.parameter = parameter;
	}
	
	/**
	 * @return the severity
	 */
	public ErrorSeverity getSeverity() {
		return severity;
	}
	
	/**
	 * @param severity the severity to set
	 */
	public void setSeverity(ErrorSeverity severity) {
		this.severity = severity;
	}
	
	/**
	 * @return the subdomain
	 */
	public String getSubdomain() {
		return subdomain;
	}
	
	/**
	 * @param subdomain the subdomain to set
	 */
	public void setSubdomain(String subdomain) {
		this.subdomain = subdomain;
	}
}