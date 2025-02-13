package com.Construstors;

public class NoArgumentsCons {

	int employeeId=001;
	String employeeName="Wills";
	
	//No argument constructor
	
	NoArgumentsCons(){
		System.out.println("Employe object is created");
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
     NoArgumentsCons employee= new NoArgumentsCons();
	}

}
