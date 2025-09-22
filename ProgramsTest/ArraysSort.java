package ProgramsTest;

import java.util.Arrays;

public class ArraysSort {
	public static void main(String[] args) {
		
		int arr[]= {20,14, 20, 100, 2, 4};
//		Arrays.sort(arr);
//		System.out.println(Arrays.toString(arr));
		
       int high=arr[0];
       
       for(int current: arr) {
    	   if(current>high) {
    		   high=current;
    	   }
       }
       System.out.println(high);
	}

}
