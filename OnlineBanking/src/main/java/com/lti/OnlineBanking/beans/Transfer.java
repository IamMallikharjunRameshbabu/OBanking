package com.lti.OnlineBanking.beans;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "TRANSFERS")
public class Transfer {

	@Id
	@Column(name = "FROMACCOUNT")
	private long fromAccount;
	@Column(name = "TOACCOUNT")
	private long toAccount;
	@Column(name = "AMOUNT")
	private long amount;
	@Column(name = "TRANSACTIONDATE")
	private String transactionDate;
	@Column(name = "REMARKS")
	private String remarks;
	public Transfer() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Transfer(long fromAccount, long toAccount, long amount, String transactionDate, String remarks) {
		super();
		this.fromAccount = fromAccount;
		this.toAccount = toAccount;
		this.amount = amount;
		this.transactionDate = transactionDate;
		this.remarks = remarks;
	}
	@Override
	public String toString() {
		return "Transfer [fromAccount=" + fromAccount + ", toAccount=" + toAccount + ", amount=" + amount
				+ ", transactionDate=" + transactionDate + ", remarks=" + remarks + "]";
	}
	public long getFromAccount() {
		return fromAccount;
	}
	public void setFromAccount(long fromAccount) {
		this.fromAccount = fromAccount;
	}
	public long getToAccount() {
		return toAccount;
	}
	public void setToAccount(long toAccount) {
		this.toAccount = toAccount;
	}
	public long getAmount() {
		return amount;
	}
	public void setAmount(long amount) {
		this.amount = amount;
	}
	public String getTransactionDate() {
		return transactionDate;
	}
	public void setTransactionDate(String transactionDate) {
		this.transactionDate = transactionDate;
	}
	public String getRemarks() {
		return remarks;
	}
	public void setRemarks(String remarks) {
		this.remarks = remarks;
	}
	
	
}
