package com.polymorphism;

public class Overloading {
	
	public void talk(Parents talkingStyle) {
		System.out.println("Respect");
	}
	
	public void talk(Partner talkingStyle ) {
		System.out.println("Romantic and Life");
	}

	public void talk(Boss talkingStyle) {
		System.out.println("Bussiness");
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Overloading A= new Overloading();
		Parents parents =new Parents();
		A.talk(parents);
		
		Partner partner=new Partner();
		A.talk(partner);
		
		Boss boss=new Boss();
		A.talk(boss);
	}

}
