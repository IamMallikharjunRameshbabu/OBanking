package com.lti.OnlineBanking.beans;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="LOGINS")
public class Login {
	@Id
	@Column(name ="USERID")
	private long userId;

	@Column(name = "USERPASS")
	private String userpass;

	public Login(long userId, String userpass) {
		super();
		this.userId = userId;
		this.userpass = userpass;
	}

	public Login() {
		super();
		// TODO Auto-generated constructor stub
	}

	@Override
	public String toString() {
		return "Login [userId=" + userId + ", userpass=" + userpass + "]";
	}

	public long getUserId() {
		return userId;
	}

	public void setUserId(long userId) {
		this.userId = userId;
	}

	public String getUserpass() {
		return userpass;
	}

	public void setUserpass(String userpass) {
		this.userpass = userpass;
	}

}

