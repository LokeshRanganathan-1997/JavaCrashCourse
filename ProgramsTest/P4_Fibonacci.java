package ProgramsTest;

public class P4_Fibonacci {
	public static void main(String[] args) {

		int num=6,a=0,b=1;
		for(int i=1;i<=num;i++) {
			System.out.println("Fibonacci Series list is: "+a+" ");      
			int sum=a+b;
			a=b;
			b=sum;				
//			
//			
//			Iteration->i=1
//			Fibonacci Series list is: 0
//			sum=0+1
//			a=1
//			b=1
//			
//			Iteration->i=2
//			Fibonacci Series list is: 1
//			sum=1+1
//			a=1
//			b=2
//			
//			Iteration->i=3
//			Fibonacci Series list is: 1
//			sum=1+2
//			a=2
//			b=3
//			
//			Iteration->i=4
//			Fibonacci Series list is: 2
//			sum=2+3
//			a=3
//			b=5
//			
//			Iteration->i=5
//			Fibonacci Series list is: 3
//			sum=3+5
//			a=5
//			b=8
//			
//			Iteration->i=6
//			Fibonacci Series list is: 5
//			sum=5+8
//			a=8
//			b=13


			
		}			
	}
}
