package com.stringConcepts;

public class StringMethods {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String name=" Willson ";
		int number=3;
		
		System.out.println(name.charAt(1));
		
		System.out.println(name.length());
		
		System.out.println(name.equals("Honey"));
		
		System.out.println(name.equalsIgnoreCase("Willson"));
		
		System.out.println(name.isEmpty());
		
		System.out.println(name.contains("H"));
		
		System.out.println(name.substring(1));
		
		System.out.println(name.substring(0,5));
		
		System.out.println(name.concat("Honey"));
		
		System.out.println(name.replace("Willson", "WillsonHoney"));
		
		System.out.println(name.indexOf("W"));
		
		System.out.println(name.trim());
		
		System.out.println(String.valueOf(number));
			}

}
