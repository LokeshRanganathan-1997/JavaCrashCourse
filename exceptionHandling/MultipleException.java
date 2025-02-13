package com.exceptionHandling;

public class MultipleException {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		try {
		int num1=5;
		int num2=4;
		int result=num1/num2;
		System.out.println(result);
	}
		catch (ArithmeticException e){
			System.out.println("This is Arithmetic problem issue");
		}
		
		catch (NullPointerException e){
			System.out.println("This is handled by null point exeption");
		}
		catch (Exception e) {
			e.printStackTrace();
			System.out.println("Drink coffee and verify the result");
		}
	}
}
