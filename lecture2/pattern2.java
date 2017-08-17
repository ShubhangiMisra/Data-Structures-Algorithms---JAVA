package lecture2;
import java.util.Scanner;

public class pattern2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       Scanner s=new Scanner (System.in);
       System.out.println("enter n");
       int n=s.nextInt();
       int row=1;
       while (row<=n){
    	     
    	     int col1=1;
    	     while(col1<=(n-row)){
    	    	 System.out.print(" ");
    	    	 col1++;}
    	    	 int value= row;
    	    	 int col2=1;
    	    	 while (col2<=row){
    	    		 System.out.print(value); 
    	    		 value++;
    	    		 col2++;}
    	    	 int col3=1;
    	    	 while (col3<=row-1){
    	    		 System.out.print(value-2);
    	    		 col3++;
    	    		 value--;}
    	    	 System.out.println();
    	    	 row++;
    	    	 }
    	    		 
    	     }
       }
       
       
	


