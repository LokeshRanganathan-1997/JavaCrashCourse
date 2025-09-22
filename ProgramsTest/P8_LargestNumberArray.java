package ProgramsTest;

public class P8_LargestNumberArray {

	public static void main(String[] args) {
		int arr[]= {10,20,30,1000,10,35,23,100000,2000};
		int max=arr[0];
		for(int i=0;i<arr.length;i++) {
			if(arr[i]>max) {
				max=arr[i];
				System.out.println("Max value is"+max);
			}
		}
		System.out.println("Largest Number is"+max);

	}	
}
