package com.capg.pay.service;

import java.io.IOException;
import java.util.List;

import com.capg.pay.bean.Account;
import com.capg.pay.dao.AccountDao;

public  class AccountService implements IAccountService{
AccountDao dao = new AccountDao();
	public boolean addAccountDetails(Account pojo)
	{
		return dao.addAccountDetails(pojo);
		
	}
	public List displayDetails(int custId)
	{
		return dao.displayDetails(custId);
	}

	public int depositAmount(double amount) {
		// TODO Auto-generated method stub
		return dao.depositAmount(amount);
		
	}
	public int withdrawAmount(double amount)
	{
		return dao.withdrawAmount(amount);
	}
	
	public void showBalance() {
		// TODO Auto-generated method stub
	  dao.showBalance();
	}
	public void fundTransfer(double accountNo,double accountNo2) {
		// TODO Auto-generated method stub
	    
	 dao.fundTransfer(accountNo, accountNo2);
	}
	
}
