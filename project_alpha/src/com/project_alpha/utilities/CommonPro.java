package com.project_alpha.utilities;


public class CommonPro {

	public static void main(String[] args) {
       		
	}
	
	//Check Anagram String 
	public static boolean isAnagramString(String string1,String string2) {
		boolean status=false;
		
		char arr1[]=string1.toLowerCase().toCharArray();
		char arr2[]=string2.toLowerCase().toCharArray();
				
		int flag=0;
		if(arr1.length==arr2.length) {
		for(int i=0;i<arr1.length;i++) {
			for(int j=0;j<arr2.length;j++) {
				if(arr1[i]==arr2[j]) {
	             flag++;				
				}
				}
			}
		if(flag==arr1.length) {
			status=true;
		}
		}
		else {
			status=false; 
		}
		
		return status;
		
	}


	//Check Armstrong Number
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

	//Check Factorial Number
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
	
	
	//Check Palindrome Number

	public static boolean isPalindrome(String str) {
		boolean status=false;
		
		StringBuffer strb=new StringBuffer(str);
		String str1=new String(strb.reverse());
	 	
	    if(str.equals(str1)) {
	    	status=true;
	    }
		
		return status; 
	}

	
	//Check Perfect Number

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

	
	//Check Prime Number

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

	
}
