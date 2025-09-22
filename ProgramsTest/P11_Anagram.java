package ProgramsTest;

import java.util.Arrays;

public class P11_Anagram {

	public static void main(String[] args) {

		String s1="Triangle";
		String s2="integral";
		String lowerCase = s1.toLowerCase();
		String lowerCase2 = s2.toLowerCase();

		char[] charArray = lowerCase.toCharArray();
		char[] charArray2 = lowerCase2.toCharArray();

		Arrays.sort(charArray);
		Arrays.sort(charArray2);

		if(Arrays.equals(charArray, charArray2)) {
			System.out.println("It is anagram");
		}else {
			System.out.println("It is not an anagram");
		}

	}	
}
