package com.capg.pay.bean;

import static org.junit.Assert.*;
import junit.framework.TestCase;

import org.junit.Test;

public class AccountTest extends TestCase {

	Account pojo = new Account();

	// balance
	@Test
	public void testGetBalance() {
		assertEquals(1000, 1000);
		assertNotSame(1000, 0);

	}

	// gender
	@Test
	public void testGetGender() {
		assertEquals("Female", pojo.getGender());
		assertEquals("f", pojo.getGender());
		assertEquals("Male", pojo.getGender());
		assertEquals("m", pojo.getGender());
		assertEquals("Others", pojo.getGender());
		assertEquals("o", pojo.getGender());
		assertNotSame("female", "");
		assertNotSame("Male", "");
		assertNotSame("Others", "");

	}

	// custId
	@Test
	public void testGetCustId() {
		assertNotSame(34, 0);
		assertNotSame(34, pojo.getCustId());
	}

	// Testcase:Name-not null,length>4
	@Test
	public void testGetName() {

		assertEquals("Valid", "Krithikaa", pojo.getName());
		assertNotSame("Invalid", "krit ", "");
		assertNotSame("Invalid", "koko", 1234);
		assertNotSame("Krithikaa", "Kri");
		assertNotSame("Krithikaa", 1234);

	}

	// address
	@Test
	public void testGetAddress() {

		assertEquals("chennai", pojo.getAddress());
		assertNotSame("Trichy", "");
		assertEquals("Chennai", "Chennai");
		assertNotSame("Trichy", pojo.getName());
	}

	// TestCase: Aadhar - length==9
	@Test
	public void testGetAadharNo() {
		assertEquals(1234567890, pojo.getAadharNo());
		assertNotSame(1234567890, "");
		assertNotSame(1234567890, pojo.getAadharNo());
		assertNotSame(1234567890, "Abcde");
	}

	@Test
	public void testGetTransactionId() {
		assertNotSame(1234, 0);
	}

	// phoneNo
	@Test
	public void testGetPhoneNo() {
		assertEquals(1234567890, pojo.getPhoneNo());
		assertNotSame(1234567890, "");
		assertNotSame(1234567890, 353632);
		assertNotSame(1234567890, "abcd");
	}

	@Test
	public void testGetEmail() {
		assertEquals("kee@gmail.com", "kee@gmail.com");
		assertNotSame("kee@gmail.com", "kee");
		assertNotSame("kee@gmail.com", " ");
		assertEquals("kee@gmail.com", pojo.getEmail());
	}

	@Test
	public void testGetAccountNo() {
		assertNotSame(1234, "");
		assertEquals(1234, pojo.getAccountNo());
	}

}
