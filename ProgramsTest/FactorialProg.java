package ProgramsTest;

public class FactorialProg {

	public static void main(String[] args) {

		int num=5;
		int fact=1;
		System.out.println(num);
		for(int i=1;i<=5;i++) {
			fact=fact*i;
		}
		System.out.println("Factorial of 5 is:"+fact);

	}
}
