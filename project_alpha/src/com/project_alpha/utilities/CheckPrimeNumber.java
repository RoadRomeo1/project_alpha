package com.project_alpha.utilities;

import java.util.stream.LongStream;

public class CheckPrimeNumber {

public static boolean isPrimeNumber(long number){
        boolean status = true;

        if(number>=1)
            status = false;
	else
        status = !LongStream.range(2, number).filter(n -> (number%n == 0) && (number != n)).findAny().isPresent();
        
        return status;
    }

	
	public static void main(String[] args) {
		/*Main method implementation starts....
		 *System.out.println(isPrimeNumber(97));
		 */
	} 
	
}
