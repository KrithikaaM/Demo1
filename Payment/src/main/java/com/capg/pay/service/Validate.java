package com.capg.pay.service;

public class Validate {

	public boolean nameValid(String name) {
		// TODO Auto-generated method stub
		if(name.equals("") || name.length()<4)
		 {
			 return false;
		 }
		 
		return true;
	
	}

	public boolean aadharValid(int aadharNo) {
		// TODO Auto-generated method stub
		//char[] c =  String.valueOf(aadharNo).toCharArray();
		 if(aadharNo==0)
		 {
			 return false;
		 }
		 return true;
	
	}

	public boolean phoneNoValid(int phoneNo) {
		char[] phNo =  String.valueOf(phoneNo).toCharArray();
		 if(phoneNo==0||phNo.length>10||phNo.length<10)
		 {
			 return false;
		 }
		 else if(phNo.length==10)
		 {
		 return true;
		 }
		return false;
	}

	public boolean amountValidate(double amount) {
	
		if(amount==0||amount>200000)
		{
		return false;
		}
		return true;
	}

	public boolean genderValid(String gender) {
		// TODO Auto-generated method stub
		if(gender.equals("female")||gender.equals("Female")||gender.equals("F")||gender.equals("f")||gender.equals("m")||gender.equals("M"))
		{
			return true;
		}
		return false;
	}

	public boolean addressValid(String address) {
		// TODO Auto-generated method stub
		return true;
	}

	
}
