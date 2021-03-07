package com.banking.dto;

import java.io.Serializable;
/**
 * Transaction Entity
 */
import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonFormat;

/**
 * Transaction Entity
 * 
 * @author Gautham Bhonsle
 *
 */
@Entity
@Table(name = "TRANSACTION")
public class Transaction implements Serializable {
	/**
	 * Serial version
	 */
	private static final long serialVersionUID = 1L;

	@Id
	private int accountNumber;

	private String accountType;

	@JsonFormat(pattern = "dd/MM/yyyy HH:mm:ss")
	private Date transactionDate;

	private String currency;

	private double creditAmount;

	private double debitAmount;

	private String transactionType;

	private String transactionNarrative;

	public Transaction(int accountNumber, String accountType, Date transactionDate, String currency,
			double creditAmount, double debitAmount, String transactionType, String transactionNarrative) {
		super();
		this.accountNumber = accountNumber;
		this.accountType = accountType;
		this.transactionDate = transactionDate;
		this.currency = currency;
		this.creditAmount = creditAmount;
		this.debitAmount = debitAmount;
		this.transactionType = transactionType;
		this.transactionNarrative = transactionNarrative;
	}

	public Transaction() {
		// TODO Auto-generated constructor stub
	}

	public int getAccountNumber() {
		return accountNumber;
	}

	public void setAccountNumber(int accountNumber) {
		this.accountNumber = accountNumber;
	}

	public String getAccountType() {
		return accountType;
	}

	public void setAccountType(String accountType) {
		this.accountType = accountType;
	}

	public Date getTransactionDate() {
		return transactionDate;
	}

	public void setTransactionDate(Date transactionDate) {
		this.transactionDate = transactionDate;
	}

	public String getCurrency() {
		return currency;
	}

	public void setCurrency(String currency) {
		this.currency = currency;
	}

	public double getCreditAmount() {
		return creditAmount;
	}

	public void setCreditAmount(double creditAmount) {
		this.creditAmount = creditAmount;
	}

	public double getDebitAmount() {
		return debitAmount;
	}

	public void setDebitAmount(double debitAmount) {
		this.debitAmount = debitAmount;
	}

	public String getTransactionType() {
		return transactionType;
	}

	public void setTransactionType(String transactionType) {
		this.transactionType = transactionType;
	}

	public String getTransactionNarrative() {
		return transactionNarrative;
	}

	public void setTransactionNarrative(String transactionNarrative) {
		this.transactionNarrative = transactionNarrative;
	}

}
