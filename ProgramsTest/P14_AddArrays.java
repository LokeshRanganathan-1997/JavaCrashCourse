package ProgramsTest;

public class P14_AddArrays {
	public static void main(String[] args) {

		int arr[]= {20,20,22,24,21,21,22,34};
		int sum=0;

		for(int num: arr) {
			sum=sum+num;
		}
		System.out.println(sum);
	}
}
