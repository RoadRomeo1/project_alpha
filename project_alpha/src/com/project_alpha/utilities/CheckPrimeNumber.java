package com.project_alpha.utilities;

public class CheckPrimeNumber {

	public static boolean isPrimeNumber(long number) {
		boolean status=false;
       
		if(number==0||number==1) {
			status=false;
		}
		else {
			long temp=number/2;
			int flag=0;
			
			for(int i=2;i<=temp;i++) {
				if(number%i==0) {
					status=false;
					flag++;
					break;
				}
			}
			if(flag==0) {
				status=true;
			}
		}
		
		return status;
	}
	
	public static void main(String[] args) {
		/*Main method implementation starts....
		 *System.out.println(isPrimeNumber(97));
		 */
	} 
	
}
