package com.project_alpha.utilities;
public class PalindromeCheck {



	public static boolean isPlaindrome(String str) {
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
		//System.out.println(isPlaindrome("madam"));
	 }
}
