package com.project_alpha.utilities;

public class CheckAnagramString {

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
	
	public static void main(String[] args) {
		/*Main Method implementation starts...
		 * System.out.println(isAnagramString("ape","ped"));
		 
		 */	
	}
	
}
