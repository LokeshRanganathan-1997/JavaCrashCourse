package ProgramsTest;

public class P5_CountString {
	public static void main(String[] args) {
	
		String str="Automation";
		String lowerCase = str.toLowerCase();
		int count=0;
		for(int i=0;i<lowerCase.length();i++) {
			if(lowerCase.charAt(i)=='a') {
				count++;
			}
		}
		System.out.println("Count is 'a' is :"+count);
	}
}
