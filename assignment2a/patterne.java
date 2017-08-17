package assignment2a;

import java.util.Scanner;

public class patterne {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s= new Scanner(System.in);
        System.out.println("enter no. of rows");
        int n=s.nextInt();
        for (int row=0;row<n;row++){
        	  for(int col=0;col<n;col++){
        		  if (col==n-row-1)
        			  System.out.print("*");
        		  else
        		  System.out.print(n-col);
        	  }System.out.println();
        }
	}

}
