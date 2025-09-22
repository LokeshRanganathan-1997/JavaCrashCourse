package ProgramsTest;

import io.cucumber.messages.types.TestCase;

public class ReverseWordsSentence {
public static void main(String[] args) {
	
	//Split and Reverse the sentence
	String test="Java Programming Language";
	String rev="";
	String[] testSplited = test.split(" ");
	for(int i=testSplited.length-1;i>=0;i--) {
		System.out.print(testSplited[i]+" ");
	}
	
	//Just Reverse the sentence
	
	for(int i=test.length()-1;i>=0;i--) {
		rev=rev+test.charAt(i);
	}
	System.out.println(rev);
}
}
