package com.project_alpha.utilities;


public class PalindromeCheck {

	public static boolean isPlaindrome(String str) {
		boolean status=false;
		
		StringBuffer strb=new StringBuffer(str);
		StringBuffer strb2=strb.reverse();
		
		if(strb.equals(strb2)&&strb==strb2) {
			status=true;
		}
		
		return status; 
	}
	
	
	public static void main(String[] args) {
        System.out.println(isPlaindrome("toe"));
	}

}
