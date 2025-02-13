package com.staticMethods;

public class StaticMethod {

	public static void method1() {
		System.out.println("Static method-1");
	}
	
	public void method2() {
		System.out.println("Non static method-2");
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		method1();
		
		StaticMethod A= new StaticMethod();
		A.method2();
	}

}
