package com.capg.pay.bean;

public class Account {

	//objects
	private String name;
	private String address;
	private int aadharNo;
	private int phoneNo;
	private String email;
	private double accountNo;
	private int custId;
	private int transactionId;
	private String gender;
	private double balance;
	private String username;
	private String password;
	public String getUsername() {
		return username;
	}
	public void setUserName(String username) {
		this.username = username;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public double getBalance() {
		return balance;
	}
	public void setBalance(double balance) {
		this.balance = balance;
	}
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	public int getCustId() {
		return custId;
	}
	public void setCustId(int custId) {
		this.custId = custId;
	}
	//getters setters
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public double getAadharNo() {
		return aadharNo;
	}
	public int getTransactionId() {
		return transactionId;
	}
	public void setTransactionId(int transactionId) {
		this.transactionId = transactionId;
	}
	public void setAadharNo(int aadharNo) {
		this.aadharNo = aadharNo;
	}
	public double getPhoneNo() {
		return phoneNo;
	}
	public void setPhoneNo(int phoneNo) {
		this.phoneNo = phoneNo;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public double getAccountNo() {
		return accountNo;
	}
	public void setAccountNo(double accountNo) {
		this.accountNo = accountNo;
	}
	@Override
	public String toString() {
		return "Account [name=" + name + ", address=" + address + ", aadharNo="
				+ aadharNo + ", phoneNo=" + phoneNo + ", email=" + email
				+ ", accountNo=" + accountNo + ", custId=" + custId
				+ ", transactionId=" + transactionId + ", gender=" + gender
				+ ", balance=" + balance + "]";
	}
	
	
	

	
		
	

	

	
	
	
	
}
