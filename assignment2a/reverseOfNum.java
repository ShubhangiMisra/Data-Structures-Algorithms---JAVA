package assignment2a;

import java.util.Scanner;

public class reverseOfNum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 Scanner s= new Scanner(System.in);
	        System.out.println("enter no.");
	        int n=s.nextInt();
	        int q=n;
	        int rev=0;
	        while (q!=0){
	        	  int r=q%10;
	        	  rev=rev*10+r;
	        	  q/=10;
	        	  
	        }System.out.println(rev);
	}

}
