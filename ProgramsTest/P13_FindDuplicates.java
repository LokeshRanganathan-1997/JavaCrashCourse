package ProgramsTest;

import java.util.HashSet;
import java.util.Set;

public class P13_FindDuplicates {
public static void main(String[] args) {

	int arr[]= {20,20,22,24,21,21,22,34};
	Set<Integer> seen=new HashSet<Integer>();
	Set<Integer> dup=new HashSet<Integer>();
	
	for(int num:arr) {
		if(!seen.add(num)) {
			dup.add(num);
		}
	}
	System.out.println("Duplicate numbers are :"+dup);
}	
}
