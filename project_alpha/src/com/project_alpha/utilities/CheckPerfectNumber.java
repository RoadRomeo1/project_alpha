package com.project_alpha.utilities;

public class CheckPerfectNumber {

	public static boolean isPerfectNumber(long number) {
		
		boolean status=false;
		
		long temp=0;
		
		for(int i=1;i<number;i++) {
			if(number%i==0) {
				temp+=i;
			}
		}
		
		if(temp==number) {
			status=true;
		}
		
		return status;
		
	}
	
	public static void main(String[] args) {
		/*Main method implementation starts...
		*System.out.println(isPerfectNumber(8128));
		*/
		}
	
}
