package ProgramsTest;

public class P7_SwapNumbers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//With temp,
		int a=5, b=10;
		int temp=a;
		a=b;
		b=temp;
		System.out.println("Value of a is :"+a);
		System.out.println("Value of b is :"+b);

	   //Without temp,
		int c=5, d=10;
		c=c+d;
		d=c-d;
		c=c-d;
		System.out.println("Value of c is:"+c);
		System.out.println("Value of d is:"+d);
		
		
		
	}
}
