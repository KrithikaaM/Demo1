package com.capg.pay.service;

import java.util.List;

import com.capg.pay.bean.Account;

public interface IAccountService {

	public boolean addAccountDetails(Account pojo);
	public List displayDetails(int custId);
	public int depositAmount(double amount);
	public int withdrawAmount(double amount);
	public void showBalance();
	public void fundTransfer(double accountNo,double accountNo1);
	
	
	
}
