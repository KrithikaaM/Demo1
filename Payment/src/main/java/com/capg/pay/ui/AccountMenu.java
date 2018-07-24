package com.capg.pay.ui;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Random;

import com.capg.pay.bean.Account;
import com.capg.pay.service.AccountService;
import com.capg.pay.service.Validate;


public class AccountMenu {

	static Account pojo = new Account();
	static Account pojo2 = new Account();
	static AccountService service = new AccountService();
static Validate valid = new Validate();
	static BufferedReader br = new BufferedReader(new InputStreamReader(
			System.in));

	public static void main(String[] args) throws IOException {
        String userName,password;
     //   pojo.setUserName("krithikaa");
      //  pojo.setPassword("krithikaa123");
		int choice = 0;
		
		do {
			System.out.println("Welcome to E-Wallet.");
			System.out.println("Please enter your choice (1-7)");
			System.out.println("******************************");
			
			System.out.println("1.Login");
			System.out.println("2.Deposit Amount");
			System.out.println("3.Withdraw Amount");
			System.out.println("4.Show balance");
			System.out.println("5.Fund transfer");
			System.out.println("6.Print transaction");
			System.out.println("7.Log Out");
			System.out.println("******************************");
			try {

				choice = Integer.parseInt(br.readLine());
				switch (choice) {
				
				case 1:
					login();
					break;
				case 2:
					
					depositAmount();
		           
					break;
				case 3:
					withdrawAmount();
					break;
				case 4:
					showBalance();
					break;
				case 5:
					fundtransfer();
					break;
				case 6:
					printTransaction();
					break;
				case 7:
					logOut();
					break;
				default:
					System.out.println("Please enter valid choice (1-7)");
					break;
				}

			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		} while (choice != 8);

	}
	public static void login() throws IOException
	{
	System.out.println("*******LOGIN******");
	System.out.println("Enter Username: ");
    String usernameLogin = br.readLine();
    System.out.println("Enter Password:");
    String passwordLogin = br.readLine();
    if(usernameLogin.equals(pojo.getUsername())&&passwordLogin.equals(pojo.getPassword()))
    {
    	System.out.println("login success!");
	}
    else
    {   
    	System.out.println("Wrong crendentials...");
    	System.out.println("Please create an account first!");
    	createAccount();
    }
	}
	
	private static void logOut() {
		// TODO Auto-generated method stub
		System.out.println("You have chosen to logout");
		
	}

	private static void printTransaction() {
		// TODO Auto-generated method stub
		Account pojo2 = new Account();
		System.out.println("You have chosen to print transaction");
		System.out.println("Transaction successfull!!");
		//System.out.println("Transaction ID:"+pojo2.getTransactionId());
		System.out.println("Balance for"+pojo.getCustId()+"is:"+pojo.getBalance());
	
		

	}

	private static void fundtransfer() {
		// TODO Auto-generated method stub
		
		AccountService service = new AccountService();
		//setting values for fund transfer
		
		
		/*int transactionId = rand.nextInt(50);
		pojo2.setTransactionId(transactionId);*/
		
		System.out.println("You have chosen to transfer amount");
		System.out.println("Enter account no of other person:");
	double accountNo2;
	try {
		accountNo2 = Double.parseDouble(br.readLine());
		   double accountNo = pojo.getAccountNo();
		   accountNo2 = pojo2.getAccountNo();
		  
				service.fundTransfer(accountNo, accountNo2);
	} catch (NumberFormatException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	} catch (IOException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}	

		
	}

	private static void showBalance() {
		// TODO Auto-generated method stub
		System.out.println("You have chosen to show balance");
		
		try {
			
				service.showBalance();
			}
		 catch (NumberFormatException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		

		 }

	}

	private static void withdrawAmount() {
		
	
		double balance = 0;
		double amount = 0;
		double withbal = 0;
		System.out.println("You have chosen to withdraw amount");
		
		try {
			
							
				System.out.println("Enter amount you want to withdraw:");
				amount = Double.parseDouble(br.readLine());
				boolean isAmount = valid.amountValidate(amount);
				service.withdrawAmount(amount);
		}
			catch (NumberFormatException | IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		

	}

	private static void depositAmount() {
		
		// int custId = pojo.getCustId();
		double balance = 0;
		double amount = 0;
		double depbal = 0;
		System.out.println("You have chosen to deposit amount");
		
		try {
			

			System.out.println("Enter amount you want to deposit:");
			amount = Double.parseDouble(br.readLine());
			boolean isAmount = valid.amountValidate(amount);
			pojo.setBalance(1000);
			balance = pojo.getBalance();
			if(isAmount)
			{
			System.out.println("Initial Balance: " + balance);
			service.depositAmount(amount);
			}
			
			else
			{
		System.out.println("Please enter valid amount to deposit");
			}

		} catch (NumberFormatException | IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

	private static void createAccount() {
		// TODO Auto-generated method stub
		Account pojo = new Account();
		AccountService service = new AccountService();
		System.out.println("You have chosen to create account");
		System.out.println("WELCOME !!");
//name
		try {
			System.out.println("Enter your name:");
			
			String name = br.readLine();
			boolean isName = valid.nameValid(name);
		    if(!isName) {
		    	System.err.println("Enter Valid name");
		    	System.exit(0);
		    }
		
//gender
		    System.out.println("Enter your gender:");
			String gender = br.readLine();
			boolean isGender = valid.genderValid(gender);
			 if(!isGender) {
			    	System.err.println("Enter Valid gender");
			    	System.exit(0);
			    }

//address
			System.out.println("Enter your address:");
			String address = br.readLine();
			boolean isAddress = valid.addressValid(address);
			 if(!isAddress) {
			    	System.err.println("Enter Valid address");
			    	System.exit(0);
			    }
			
//aadhar			
						
			
			System.out.println("Enter your Aadhar number:(12 digits)");
			int aadharNo = Integer.parseInt(br.readLine());
			boolean isAadharNo = valid.aadharValid(aadharNo);
			if(!isAadharNo) {
		    	System.err.println("Enter Valid AadharNo");
		    	System.exit(0);
		    }
			
//phone number			
			System.out.println("Enter your Phone no:");
			int phoneNo = Integer.parseInt(br.readLine());
			boolean isPhoneNo = valid.phoneNoValid(phoneNo);
			 if(!isPhoneNo) {
			    	System.err.println("Enter Valid PhoneNo");
			    	System.exit(0);
			    }
			 
//Email
			System.out.println("Enter your Email Id:");
			String email = br.readLine();
			System.out.println("Enter your bank account number:");
			double accountNo = Double.parseDouble(br.readLine());
			Random rand = new Random();
			int custId = rand.nextInt(50);
			
		    
			System.out.println("Enter new username:");
			String username = br.readLine();
			System.out.println("Enter password:");
			String password = br.readLine();
			
			if(isAadharNo&&isName&&isPhoneNo)
			{
			pojo.setName(name);
			pojo.setAadharNo(aadharNo);
			pojo.setAccountNo(accountNo);
			pojo.setAddress(address);
			pojo.setEmail(email);
			pojo.setGender(gender);
			pojo.setPhoneNo(phoneNo);
			pojo.setCustId(custId);
			pojo.setBalance(1000.00);
		    pojo.setUserName(username);
		    pojo.setPassword(password);
			service.addAccountDetails(pojo);
			System.out.println(pojo.toString());
			System.out.println("Details added successfully !!");
			//login();
            System.out.println(pojo.toString());
			//System.out.println("Your cust id is:" + pojo.getCustId());
			// System.out.println(b);
			// System.out.println("1."+pojo);
			//System.out.println("Account Details :");
			//service.displayDetails(custId);
			
			}
			else
			{
				System.out.println("Enter valid values please.");
			System.exit(0);
			}
			
			
			

		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
