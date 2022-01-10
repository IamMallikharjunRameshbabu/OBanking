
package com.lti.OnlineBanking.beans;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@Entity
@Table(name = "PAYEES")
public class Payee{

	@Id
	@Column(name = "PAYID")
	private int payid;

	@Column(name = "PAYNAME")
	private String payname;

	@Column(name = "PAYACCNO")
	private String payaccno;

	@Column(name = "PAYREACCNO")
	private String payreaccno;

	@Column(name = "PAYNN")
	private String paynn;

	@JsonIgnoreProperties({"hibernateLazyInitializer", "handler"})
	@ManyToOne(fetch=FetchType.LAZY,cascade={CascadeType.ALL})
	@JoinColumn(name = "ACCNO")
	private Account account;

	public Payee(int payid, String payname, String payaccno, String payreaccno, String paynn, Account account) {
		super();
		this.payid = payid;
		this.payname = payname;
		this.payaccno = payaccno;
		this.payreaccno = payreaccno;
		this.paynn = paynn;
		this.account = account;
	}

	public Payee() {
		super();
		// TODO Auto-generated constructor stub
	}

	public int getPayid() {
		return payid;
	}

	public void setPayid(int payid) {
		this.payid = payid;
	}

	public String getPayname() {
		return payname;
	}

	public void setPayname(String payname) {
		this.payname = payname;
	}

	public String getPayaccno() {
		return payaccno;
	}

	public void setPayaccno(String payaccno) {
		this.payaccno = payaccno;
	}

	public String getPayreaccno() {
		return payreaccno;
	}

	public void setPayreaccno(String payreaccno) {
		this.payreaccno = payreaccno;
	}

	public String getPaynn() {
		return paynn;
	}

	public void setPaynn(String paynn) {
		this.paynn = paynn;
	}

	public Account getAccount() {
		return account;
	}

	public void setAccount(Account account) {
		this.account = account;
	}

	@Override
	public String toString() {
		return "Payee [payid=" + payid + ", payname=" + payname + ", payaccno=" + payaccno + ", payreaccno="
				+ payreaccno + ", paynn=" + paynn + ", account=" + account + "]";
	}


}
