package ProgramsTest;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class P12_MissingNumberArray {
	public static void main(String[] args) {
	
		int arr[]= {20,20,22,24,21};
		Set<Integer> uniqueSet=new HashSet<Integer>();
		for(int num:arr) {
			uniqueSet.add(num);
		}
		System.out.println("Removed Duplicates :"+uniqueSet);
		
		List<Integer> missing=new ArrayList<Integer>();
		for(int i=20;i<=26;i++) {
		if(!uniqueSet.contains(i)) {
			missing.add(i);
		}	
		}		
		System.out.println("Missing numbers is :"+missing);
	}
}
