package com.abstraction;

public class Verna extends Car implements CarDetails, Interface2{
    
	@Override
	public void carEngine() {
		System.out.println("Verna Car has 1litre petrol engine and has medium rpm");
	}
	
	@Override
	public void carPerformance() {
		System.out.println("Verna has mileage of 15kms and have top speed of 130kms");
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Car ABS= new Verna();
		ABS.carEngine();
		ABS.carPerformance();
	}

	@Override
	public void method1() {
		// TODO Auto-generated method stub
		
		System.out.println("This is method 1 of CarDetails");
	}

	@Override
	public void method2() {
		// TODO Auto-generated method stub
		System.out.println("This is method 2 of CarDetails");
	}

}
