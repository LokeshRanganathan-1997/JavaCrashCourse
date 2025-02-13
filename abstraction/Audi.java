package com.abstraction;

public class Audi extends Car {

	@Override
	public void carEngine() {
		System.out.println("Audi Car has 1litre petrol engine and has medium rpm");
	}
	
	@Override
	public void carPerformance() {
		System.out.println("Audi has mileage of 15kms and have top speed of 130kms");
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Car ABS=new Audi();
		ABS.carEngine();
		ABS.carPerformance();
	}

}
