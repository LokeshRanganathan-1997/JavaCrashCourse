package ProgramsTest;

public class Fibonacci1 {
	public static void main(String[] args) {
		
		int a=0, b=1;
		for(int i=0;i<10;i++) {
			System.out.println("Fibonacci series list :"+a+" ");
			int sum=a+b;
			a=b;
			b=sum;						
		}				
	}
}
