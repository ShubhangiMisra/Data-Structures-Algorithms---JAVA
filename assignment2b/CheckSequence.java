package assignment2b;

import java.util.Scanner;

public class CheckSequence {
	
	public static boolean checkSequence(int n){
		Scanner s= new Scanner(System.in);
		boolean isDec=true;
	     int previous=Integer.MAX_VALUE;
	     int current;
	     int i=1;
	     while(i<=n){
	    	  current=s.nextInt();
	    	 if(isDec==true && current>previous){
	    		 isDec=false;
	    		 
	    	 }
	    	 if(isDec!=true && current<previous){
	    		 return false;
	    	 }
	    	 if(i==n&&isDec==true){
	    		 return false;
	    	 }
	    	 
	    	 i++;
	    	 previous=current;
		
	}
	     return true;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s= new Scanner(System.in);
	     System.out.println("enter count");
	     int count= s.nextInt();
	     System.out.println(checkSequence(count));
	     
	     }

	}


