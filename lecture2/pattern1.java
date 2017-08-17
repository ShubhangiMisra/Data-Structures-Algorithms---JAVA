package lecture2;

import java.util.Scanner;

public class pattern1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
     Scanner s= new Scanner(System.in);
     System.out.println("enter no. of rows");
     int rownum= s.nextInt();
     int row=1;
     int value=1;
     while (row<=rownum){
    	   
    	   int col=1;
    	   while (col<=row){
    		   System.out.print(value);
    		   value++;
    		   col++;
    	   }
    	   row++;
    	   System.out.println();
    	 
    
     }
	}

}
