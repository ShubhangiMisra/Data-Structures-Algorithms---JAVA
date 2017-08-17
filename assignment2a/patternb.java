package assignment2a;

import java.util.Scanner;

public class patternb {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       Scanner s= new Scanner(System.in);
       System.out.println("enter no. of rows");
       int n=s.nextInt();
       System.out.println(1);
       for (int row=2;row<=n;row++){
    	      for(int col=1;col<=row;col++){
    	    	    if ((col==1)||(col==row)){
    	    	    	  System.out.print(row-1);}
    	    	    else System.out.print(0);
    	    	    	  
    	    	    	  
    	    	    }System.out.println();
    	      }
       }
	}


