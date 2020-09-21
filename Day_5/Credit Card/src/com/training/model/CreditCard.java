package com.training.model;

import java.io.Serializable;

public class CreditCard implements Serializable {
	private String cardHolderName;
	private int cardNumber;
	private String cardType;
	private double cardBalance;
	private transient double cardLimit;
	public CreditCard() {
		super();
		// TODO Auto-generated constructor stub
	}
	public CreditCard(String cardHolderName, int cardNumber, String cardType, double cardBalance, double cardLimit) {
		super();
		this.cardHolderName = cardHolderName;
		this.cardNumber = cardNumber;
		this.cardType = cardType;
		this.cardBalance = cardBalance;
		this.cardLimit = cardLimit;
	}
	public String getCardHolderName() {
		return cardHolderName;
	}
	public void setCardHolderName(String cardHolderName) {
		this.cardHolderName = cardHolderName;
	}
	public int getCardNumber() {
		return cardNumber;
	}
	public void setCardNumber(int cardNumber) {
		this.cardNumber = cardNumber;
	}
	public String getCardType() {
		return cardType;
	}
	public void setCardType(String cardType) {
		this.cardType = cardType;
	}
	public double getCardBalance() {
		return cardBalance;
	}
	public void setCardBalance(double cardBalance) {
		this.cardBalance = cardBalance;
	}
	public double getCardLimit() {
		return cardLimit;
	}
	public void setCardLimit(double cardLimit) {
		this.cardLimit = cardLimit;
	}
	@Override
	public String toString() {
		return "CreditCard [cardHolderName=" + cardHolderName + ", cardNumber=" + cardNumber + ", cardType=" + cardType
				+ ", cardBalance=" + cardBalance + ", cardLimit=" + cardLimit + "]";
	}
}
