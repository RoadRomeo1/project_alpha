package com.project_alpha.utilities;
public class CheckPalindrome {



	public static boolean isPalindrome(String str) {
		boolean status=false;
		
		StringBuffer strb=new StringBuffer(str);
		String str1=new String(strb.reverse());
	 	
	    if(str.equals(str1)) {
	    	status=true;
	    }
		
		return status; 
	}
	
	
	public static void main(String[] args) {
		//main stub comes here....
		//System.out.println(isPalindrome("madam"));
	 }
}
