package assignment2a;

import java.util.Scanner;

public class sumOfEvenAndOddDigits {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s= new Scanner(System.in);
        System.out.println("enter no.");
        int n=s.nextInt();
        int q=n,odd=0,even=0;
        
        while (q!=0){
        	  int r=q%10;
        	  if (r%2==0)
        	   even+=r;
        	  else 
        		  odd+=r;
        	  q/=10;
        	  
        }System.out.println("sum of odd digits:"+odd + "\n sum of even digits "+even);
	}

}
