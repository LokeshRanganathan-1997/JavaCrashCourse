package ProgramsTest;

import java.util.HashSet;
import java.util.Set;

public class P6_RemoveDuplicates {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int arr[]= {10,20,20,30,20,10,20};
		Set<Integer> set=new HashSet<Integer>();
		for(int num:arr) {
			set.add(num);
		}

		System.out.println("Removed Duplicates :"+set);	
	}
}
