package com.capg.pay.dao;

import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.List;

import junit.framework.TestCase;

import org.junit.Test;

import com.capg.pay.bean.Account;
import com.capg.pay.service.AccountService;

public class AccountDaoTest extends TestCase{

	Account pojo = new Account();
	Account pojo2 = new Account();
	List<Account> list = new ArrayList();
	AccountService service = new AccountService();
	@Test
	public void testAddAccountDetails() {
		assertNotNull(pojo);
		assertEquals(true,service.addAccountDetails(pojo));
	}

	@Test
	public void testDisplayDetails() {
		
		assertEquals(list,service.displayDetails(pojo.getCustId()));
		assertNotNull(pojo);
	}

	@Test
	public void testDepositAmount() {
		
		assertEquals("Enter amount", 1000, 1000);
		assertNotSame("Enter amount",1000,"");
		assertEquals(2000,service.depositAmount(1000));
	}

	@Test
	public void testWithdrawAmount() {
		
		assertEquals("Enter amount", 500, 500);
		assertNotSame("Enter amount",500,"");
		assertEquals(200,service.withdrawAmount(300));
	}
	
	public void testfundTransfer()
	{
		assertNotNull(pojo.getAccountNo());
		assertNotNull(pojo2.getAccountNo());
		assertEquals(123,pojo.getAccountNo());
	}

}
