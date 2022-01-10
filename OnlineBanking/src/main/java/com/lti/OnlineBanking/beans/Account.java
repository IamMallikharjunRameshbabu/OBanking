package com.lti.OnlineBanking.beans;


import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "ACCOUNTS")
public class Account {
	@Id
	@Column(name = "ACCNO")
	private long accNo;
	@Column(name = "USERID")
	private long userId;
	@Column(name = "USERPASS")
	private String userPass ;
	@Column(name = "TITLE")
	private String title;
	@Column(name = "FNAME")
	private String firstName;
	@Column(name = "MNAME")
	private String middleName;
	@Column(name = "LNAME")
	private String lastName;
	@Column(name = "FRNAME")
	private String fatherName;
	@Column(name = "MOBNO")
	private long mobileNum;
	@Column(name = "EMAIL")
	private String emailID;
	@Column(name = "AADHAR")
	private long aadharNum;
	@Column(name = "DOB")
	private String dob;
	@Column(name = "ADDR")
	private String Landmark;
	@Column(name = "CITY")
	private String City;
	@Column(name = "STATE")
	private String State;
	@Column(name = "PINCODE")
	private long Pincode;
	@Column(name = "OCCP")
	private String occType;
	@Column(name = "SRCINC")
	private String sourceOfIncome;
	@Column(name = "GRSINC")
	private long grossAnnualIncome;
	@Column(name = "DEBIT")
	private long debitCard;
	@Column(name = "NETBANKING")
	private long netBanking;
	@Column(name = "BAL")
	private long balance;
	public Account(long accNo, long userId, String userPass, String title, String firstName, String middleName,
			String lastName, String fatherName, long mobileNum, String emailID, long aadharNum, String dob,
			String landmark, String city, String state, long pincode, String occType, String sourceOfIncome,
			long grossAnnualIncome, long debitCard, long netBanking, long balance) {
		super();
		this.accNo = accNo;
		this.userId = userId;
		this.userPass = userPass;
		this.title = title;
		this.firstName = firstName;
		this.middleName = middleName;
		this.lastName = lastName;
		this.fatherName = fatherName;
		this.mobileNum = mobileNum;
		this.emailID = emailID;
		this.aadharNum = aadharNum;
		this.dob = dob;
		Landmark = landmark;
		City = city;
		State = state;
		Pincode = pincode;
		this.occType = occType;
		this.sourceOfIncome = sourceOfIncome;
		this.grossAnnualIncome = grossAnnualIncome;
		this.debitCard = debitCard;
		this.netBanking = netBanking;
		this.balance = balance;
	}
	public Account() {
		super();
		// TODO Auto-generated constructor stub
	}
	@Override
	public String toString() {
		return "Account [accNo=" + accNo + ", userId=" + userId + ", userPass=" + userPass + ", title=" + title
				+ ", firstName=" + firstName + ", middleName=" + middleName + ", lastName=" + lastName + ", fatherName="
				+ fatherName + ", mobileNum=" + mobileNum + ", emailID=" + emailID + ", aadharNum=" + aadharNum
				+ ", dob=" + dob + ", Landmark=" + Landmark + ", City=" + City + ", State=" + State + ", Pincode="
				+ Pincode + ", occType=" + occType + ", sourceOfIncome=" + sourceOfIncome + ", grossAnnualIncome="
				+ grossAnnualIncome + ", debitCard=" + debitCard + ", netBanking=" + netBanking + ", balance=" + balance
				+ "]";
	}
	public long getAccNo() {
		return accNo;
	}
	public void setAccNo(long accNo) {
		this.accNo = accNo;
	}
	public long getUserId() {
		return userId;
	}
	public void setUserId(long userId) {
		this.userId = userId;
	}
	public String getUserPass() {
		return userPass;
	}
	public void setUserPass(String userPass) {
		this.userPass = userPass;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getMiddleName() {
		return middleName;
	}
	public void setMiddleName(String middleName) {
		this.middleName = middleName;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	public String getFatherName() {
		return fatherName;
	}
	public void setFatherName(String fatherName) {
		this.fatherName = fatherName;
	}
	public long getMobileNum() {
		return mobileNum;
	}
	public void setMobileNum(long mobileNum) {
		this.mobileNum = mobileNum;
	}
	public String getEmailID() {
		return emailID;
	}
	public void setEmailID(String emailID) {
		this.emailID = emailID;
	}
	public long getAadharNum() {
		return aadharNum;
	}
	public void setAadharNum(long aadharNum) {
		this.aadharNum = aadharNum;
	}
	public String getDob() {
		return dob;
	}
	public void setDob(String dob) {
		this.dob = dob;
	}
	public String getLandmark() {
		return Landmark;
	}
	public void setLandmark(String landmark) {
		Landmark = landmark;
	}
	public String getCity() {
		return City;
	}
	public void setCity(String city) {
		City = city;
	}
	public String getState() {
		return State;
	}
	public void setState(String state) {
		State = state;
	}
	public long getPincode() {
		return Pincode;
	}
	public void setPincode(long pincode) {
		Pincode = pincode;
	}
	public String getOccType() {
		return occType;
	}
	public void setOccType(String occType) {
		this.occType = occType;
	}
	public String getSourceOfIncome() {
		return sourceOfIncome;
	}
	public void setSourceOfIncome(String sourceOfIncome) {
		this.sourceOfIncome = sourceOfIncome;
	}
	public long getGrossAnnualIncome() {
		return grossAnnualIncome;
	}
	public void setGrossAnnualIncome(long grossAnnualIncome) {
		this.grossAnnualIncome = grossAnnualIncome;
	}
	public long getDebitCard() {
		return debitCard;
	}
	public void setDebitCard(long debitCard) {
		this.debitCard = debitCard;
	}
	public long getNetBanking() {
		return netBanking;
	}
	public void setNetBanking(long netBanking) {
		this.netBanking = netBanking;
	}
	public long getBalance() {
		return balance;
	}
	public void setBalance(long balance) {
		this.balance = balance;
	}
	
	
}