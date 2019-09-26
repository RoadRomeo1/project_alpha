package com.project_alpha.utilities;

public class CheckArmstrongNumber {

	public static boolean isArmstrongNumber(long number) {
		boolean status=false;
		
		long temp=0;
		long copy=number;
		
		
		while(number!=0) {	
			temp=temp+(number%10)*(number%10)*(number%10);
			number=number/10;
		}
		
		if(temp==copy) {
			status=true;
		}
		
		return status;
	}
	
	public static void main(String[] args) {
		/*Main method implementation starts...
		System.out.println(isArmstrong(67));
	    */
	}
}
