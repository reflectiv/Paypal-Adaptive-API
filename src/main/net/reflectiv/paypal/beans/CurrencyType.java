package net.reflectiv.paypal.beans;

public class CurrencyType {
	private Double amount;
	private String code;
	
	/**
	 * @return the amount
	 */
	public Double getAmount() {
		return amount;
	}
	
	/**
	 * @param amount the amount to set
	 */
	public void setAmount(Double amount) {
		this.amount = amount;
	}
	
	/**
	 * @return the code
	 */
	public String getCode() {
		return code;
	}
	
	/**
	 * @param code the code to set
	 */
	public void setCode(String code) {
		this.code = code;
	}
}