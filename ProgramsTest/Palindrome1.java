package ProgramsTest;

public class Palindrome1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String name="Madam";
		String rev="";
		for(int i=name.length()-1;i>=0;i--) {
			rev=rev+name.charAt(i);
			System.out.println(rev);
		}

		if(name.equalsIgnoreCase(rev)) {
			System.out.println("It is palindrome");
		}else {
			System.out.println("It is not palindrome");
		}
	}

}
