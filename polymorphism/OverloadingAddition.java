package com.polymorphism;

public class OverloadingAddition {

	int add(int n1, int n2) {
		return n1;
	}
	
	int add(int n1, int n2, int n3) {
		return n1+n2+n3;
	}
	
	float add(float n1, float n2)
	{
		return n1+n2;
	}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		OverloadingAddition OA=new OverloadingAddition();
		System.out.println(OA.add(10,20));
		System.out.println(OA.add(100, 200, 300));
	}

}
