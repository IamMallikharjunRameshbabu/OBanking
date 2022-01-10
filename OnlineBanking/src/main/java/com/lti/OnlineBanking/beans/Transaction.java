package com.lti.OnlineBanking.beans;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name = "TRANSACTIONS")
public class Transaction {
	
	@Id
	@GeneratedValue
	@Column(name = "TXID")
	private String txId;

	@Column(name = "TXDETAILS")
	private String txDetails;

	@Column(name = "TXTYPE")
	private String txType;

	@Column(name = "TXAMOUNT")
	private long txAmount;

	@Column(name = "TXBAL")
	private long txbal;

	@ManyToOne
	@JoinColumn(name = "ACCNO")
	private Account account;

	public Transaction(String txId, String txDetails, String txType, long txAmount,
				long txbal, Account account) {
			super();
			this.txId = txId;
			this.txDetails = txDetails;
			this.txType = txType;
			this.txAmount = txAmount;
			this.txbal = txbal;
			this.account = account;
		}

		public Transaction() {
			super();
			// TODO Auto-generated constructor stub
		}

		public String getTxId() {
			return txId;
		}

		public void setTxId(String txId) {
			this.txId = txId;
		}

		public String getTxDetails() {
			return txDetails;
		}

		public void setTxDetails(String txDetails) {
			this.txDetails = txDetails;
		}

		
		public String getTxType() {
			return txType;
		}

		public void setTxType(String txType) {
			this.txType = txType;
		}

		public long getTxAmount() {
			return txAmount;
		}

		public void setTxAmount(long txAmount) {
			this.txAmount = txAmount;
		}

		public long getTxbal() {
			return txbal;
		}

		public void setTxbal(long txbal) {
			this.txbal = txbal;
		}

		public Account getAccount() {
			return account;
		}

		public void setAccount(Account account) {
			this.account = account;
		}

		@Override
		public String toString() {
			return "Transaction [txId=" + txId + ", txDetails=" + txDetails + ",  txType="
					+ txType + ", txAmount=" + txAmount + ", txbal=" + txbal + ", account=" + account + "]";
		}

		

}