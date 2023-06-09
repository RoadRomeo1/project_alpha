package com.project_alpha.utilities;

public class CheckPrimeNumber {

	    public static boolean isPrimeNumber(long number) {
		boolean status=true;
       
		if(number<=0||number==1) {
			status=false;
		}
		else {
          		  for(int i = 2; i < number; i++){
               		   if(number%i == 0 && number != i){
                    	   status = false;
                    	   break;
                	}	
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
