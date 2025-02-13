package com.exceptionHandling;

public class FinallyException {
 public static int dummy() {
	 return 3;
 }
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		try {
			System.out.println("Inside try block");
			//System.exit(0);
			System.out.println(2/0);
			//System.out.println(FinallyException.dummy());
			System.out.println("After try block");
		}
		catch(Exception e) {
			e.printStackTrace();
			System.out.println("Inside catch block");
		}
		finally {
			System.out.println("Inside finally block");
		}
	}

}
