package ProgramsTest;

import java.util.HashSet;

public class DuplicateArrays {
	public static void main(String[] args) {

		int arr[]= {2,3,4,5,2,4,5,2,2,13};
		HashSet<Integer> set=new HashSet<Integer>();
		for(int test:arr) {
			set.add(test);
		}

		System.out.println(set);
	}

}
