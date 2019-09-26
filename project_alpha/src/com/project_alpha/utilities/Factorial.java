package com.project_alpha.utilities;

public class Factorial {

	public static long getFactorial(long number) {
		long result=number;
		
		
		if(number==1||number==0) {
		
			if(number==1) {
				result=0;
			}
			
			else {
				result=1; 		
			}
			
		}
		else {
		while(number!=1) {
	        number--; 	 
			result=result*number;
		}
		
		}
		
		return result;
	}
	
	
	public static void main(String[] args) {
	
		//Main method implementation...
		//System.out.println(getFactorial(20));
	}
}
