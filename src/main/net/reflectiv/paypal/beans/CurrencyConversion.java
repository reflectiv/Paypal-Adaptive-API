package net.reflectiv.paypal.beans;


public class CurrencyConversion {
	private CurrencyType from;
	private CurrencyType to;
	private Double exchangeRate;
	
	/**
	 * @return the from
	 */
	public CurrencyType getFrom() {
		return from;
	}
	
	/**
	 * @param from the from to set
	 */
	public void setFrom(CurrencyType from) {
		this.from = from;
	}
	
	/**
	 * @return the to
	 */
	public CurrencyType getTo() {
		return to;
	}
	
	/**
	 * @param to the to to set
	 */
	public void setTo(CurrencyType to) {
		this.to = to;
	}
	
	/**
	 * @return the exchangeRate
	 */
	public Double getExchangeRate() {
		return exchangeRate;
	}
	
	/**
	 * @param exchangeRate the exchangeRate to set
	 */
	public void setExchangeRate(Double exchangeRate) {
		this.exchangeRate = exchangeRate;
	}
}