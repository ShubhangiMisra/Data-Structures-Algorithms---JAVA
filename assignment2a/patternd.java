package assignment2a;

import java.util.Scanner;

public class patternd {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        Scanner s= new Scanner(System.in);
        System.out.println("enter no. of rows");
        int n= s.nextInt();
        for (int row=n;row>=1;row--){
        	  for(int col=1;col<=row;col++){
        		  System.out.print(col);
        	  }System.out.println();
        }
	}

}
