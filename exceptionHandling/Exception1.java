package com.exceptionHandling;

class AccountBalance extends Exception{
	public AccountBalance(String exception) {
		super (exception);
	}
}

public class Exception1 {

	public void Marriage() {
		try {
			throw new AccountBalance("Account Balance is low");
		}
		catch (AccountBalance e) {
			e.printStackTrace();
			System.out.println("Please increase account balance");
			System.out.println("Use Credit card");
		}
		
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Exception1 A= new Exception1();
		A.Marriage();
	}

}
