package ProgramsTest;

public class P2_ReverseNumber {
	public static void main(String[] args) {
	int num=12345;
	String numStr=String.valueOf(num);
	StringBuilder sb=new StringBuilder(numStr);
	sb.reverse();
	String string = sb.toString();
	System.out.println("Reveresed String is "+string);
				
	}
}
