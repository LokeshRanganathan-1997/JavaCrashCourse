package ProgramsTest;

public class P9_ArmStrong {

public static void main(String[] args) {
	int num=153;
	int copy=153;
	int target=0;
	
	while(num!=0) {
		int digit=num%10;
		target=target+(digit*digit*digit);
		num=num/10;
	}
	
	if(target==copy) {
		System.out.println(copy +" It is ArmStrong number");
	}else {
		System.out.println(copy+" It is not an ArmStrong number");
	}
}	
}
