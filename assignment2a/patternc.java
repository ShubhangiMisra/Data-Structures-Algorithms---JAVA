package assignment2a;

import java.util.Scanner;

public class patternc {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
          Scanner s= new Scanner(System.in);
          System.out.println("enter no. of rows");
          int n=s.nextInt();
          for (int row=1;row<=n;row++){
        	    for (int col=1;col<=row;col++){
        	    	 if ((col==1)||(col==row)){
        	    		 System.out.print(1);}
        	    	 else System.out.print(2);
        	    	 }System.out.println();
        	    }
          }
	}


