package ProgramsTest;

public class P1_ReverseString {
	public static void main(String[] args) {
		
	String name="madam";
	String rev="";
	for(int i=name.length()-1;i>=0;i--) {
		rev=rev+name.charAt(i);
	}
	
	System.out.println(rev);
	if(name.equals(rev)) {
		System.out.println("It is palindrome");
	}else {
		System.out.println("It is not palindrome");
	}
	
	}
}
