package com.capg.pay.dao;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;






import java.util.Random;

import com.capg.pay.bean.Account;

public  class AccountDao implements IAccountDao{
//boolean flag = true;
	Account pojo = new Account();
	Account pojo2 = new Account();
	BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
  List<Account> list = new ArrayList<Account>();
	

public boolean addAccountDetails(Account pojo)
	{		
		list.add(pojo);
		
		return false;
				
	}
	public List displayDetails(int custId) {
		// TODO Auto-generated method stub
		Iterator it = (Iterator) list.iterator();
		while (it.hasNext()) {
			 Account pojo =  (Account) it.next();
			 System.out.println(pojo);
			
		}
		return list;
	
	}
	public int depositAmount(double amount)
	
	{
		double balance = 0;
		//double amount = 0;
		double depbal = 0;
		pojo.setBalance(1000);
		balance = pojo.getBalance();
		
		depbal = balance + amount;
		pojo.setBalance(depbal);
		System.out.println("Balance after deposit operation:" +pojo.getBalance());
		return 0;
	}
	public int withdrawAmount(double amount)
	{
		
		double balance = pojo.getBalance();
		System.out.println("Initial Balance: " + balance);
		double withbal = balance - amount;
		pojo.setBalance(withbal);
		System.out.println("Balance after deposit operation:" +pojo.getBalance());
		
		
		
		return 0;
		
	}
	public void showBalance()
	
	{  
			
		 double balance = pojo.getBalance();
			pojo.setBalance(balance);
			System.out.println("Your balance is:"+balance);
		
			
	}
	public void fundTransfer(double accountNo,double accountNo2) 
	{    
		for(Account pojo2:list){
			if(pojo2.getAccountNo()==accountNo2){
        System.out.println(pojo.getBalance());

		}
			
		
		}}
		
		
		
		
	}
