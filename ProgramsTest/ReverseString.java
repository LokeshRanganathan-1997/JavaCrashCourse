package ProgramsTest;

import java.util.Arrays;

public class ReverseString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//Reverse and split:
		String test="Java program";
		String[] split1 = test.split(" ");
		System.out.println(Arrays.toString(split1));
		String result="";
		for(int i=split1.length-1;i>=0;i--) {
			result=result+split1[i]+" ";
		}
		System.out.println(result.trim());
		System.out.println(result.toUpperCase());
		
	}
}
