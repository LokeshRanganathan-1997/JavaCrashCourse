package com.staticMethods;

public class StaticVariable {

	static int balance;
	String depositedBy;
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		StaticVariable A= new StaticVariable();
		A.balance=1000;
		A.depositedBy="Wills";
		
		StaticVariable B=new StaticVariable();
		B.balance=5000;
		B.depositedBy="Honey";
		
		System.out.println("Object value_1: "+A.balance);
		System.out.println("Object value_1: "+A.depositedBy);
		System.out.println("Object value_2: "+B.balance);
		System.out.println("Object value_2: "+B.depositedBy);
		
	}

}
