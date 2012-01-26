package net.reflectiv.paypal.beans;


import java.util.Date;

import net.reflectiv.paypal.enums.AckCode;

public class ResponseEnvelope {
	private AckCode ack;
	private String build;
	private String correlationId;
	private String timestamp;
	
	/**
	 * @return the ack
	 */
	public AckCode getAck() {
		return ack;
	}
	
	/**
	 * @param ack the ack to set
	 */
	public void setAck(AckCode ack) {
		this.ack = ack;
	}
	
	/**
	 * @return the build
	 */
	public String getBuild() {
		return build;
	}
	
	/**
	 * @param build the build to set
	 */
	public void setBuild(String build) {
		this.build = build;
	}
	
	/**
	 * @return the correlationId
	 */
	public String getCorrelationId() {
		return correlationId;
	}
	
	/**
	 * @param correlationId the correlationId to set
	 */
	public void setCorrelationId(String correlationId) {
		this.correlationId = correlationId;
	}
	
	/**
	 * @return the timestamp
	 */
	public String getTimestamp() {
		return timestamp;
	}
	
	/**
	 * @param timestamp the timestamp to set
	 */
	public void setTimestamp(String timestamp) {
		this.timestamp = timestamp;
	}
}