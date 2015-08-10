package com.taggy.services.cxfstartup;

import java.util.Date;

public class CardRequest {
	
	private String cardNumber;
	private Date ExpiryDate;
	private String username;
	
	public String getCardNumber() {
		return cardNumber;
	}
	public void setCardNumber(String cardNumber) {
		this.cardNumber = cardNumber;
	}
	public Date getExpiryDate() {
		return ExpiryDate;
	}
	public void setExpiryDate(Date expiryDate) {
		ExpiryDate = expiryDate;
	}
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	
	
	

}
