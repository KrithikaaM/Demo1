package com.capg.app.Payment;

import static org.junit.Assert.*;

import org.junit.Test;

import com.capg.pay.service.Validate;

public class ValidateTest {

	Validate v = new Validate();
	@Test
	public void testNameValid() {
		assertEquals(true, v.nameValid("krithikaa"));
		
		
	}

	@Test
	public void testAadharValid() {
		assertEquals(true, v.aadharValid(Integer.valueOf(1234567890)));
	}

	@Test
	public void testPhoneNoValid() {
		assertEquals(true, v.phoneNoValid(Integer.valueOf(1234567890)));
	}
	
	@Test
	public void testamountValidate()
	{
		assertEquals(true, v.amountValidate(2300));
	}

}
