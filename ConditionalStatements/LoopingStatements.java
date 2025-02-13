package com.ConditionalStatements;

public class LoopingStatements {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		for(int Tea=0; Tea<10; Tea+=2 ) {
			System.out.println("Daily Tea drinking 10times");
		}
		
		int Coffee=0;
		while(Coffee<10) {
			System.out.println("Daily Coffee drinking 10times");
			Coffee++;
		}
		
		int Horlicks=0;
		do {
			System.out.println("Daily Horlicks drinking 10times");
			Horlicks++;
		}while(Horlicks<10);
	}

}
