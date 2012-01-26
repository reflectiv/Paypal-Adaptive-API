package net.reflectiv.paypal.beans;


public class PayError {
	private String error;
	private Receiver receiver;
	
	/**
	 * @return the error
	 */
	public String getError() {
		return error;
	}
	
	/**
	 * @param error the error to set
	 */
	public void setError(String error) {
		this.error = error;
	}
	
	/**
	 * @return the receiver
	 */
	public Receiver getReceiver() {
		return receiver;
	}
	
	/**
	 * @param receiver the receiver to set
	 */
	public void setReceiver(Receiver receiver) {
		this.receiver = receiver;
	}
}