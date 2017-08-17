package lecture2;

import java.util.Scanner;

public class checkForPrime {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
      Scanner s= new Scanner(System.in);
      System.out.println("enter no.");
      int num= s.nextInt();
      int divisor=2;
      while (num>divisor){
    	    if (num%divisor==0){
    		  System.out.println("composite");
    		  return;
    	    }
    	    else divisor=divisor+1; 
    	     }
      System.out.println("prime");
    	    	 
      }
      
	}


