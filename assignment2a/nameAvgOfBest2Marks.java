package assignment2a;

import java.util.Scanner;

public class nameAvgOfBest2Marks {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       Scanner s=new Scanner(System.in);
       
    	     
    	     System.out.println("enter subject 1 name"); 
    	     String str1=s.nextLine();
    	     System.out.println("enter subject 2 name"); 
    	     String str2=s.nextLine();
    	     System.out.println("enter subject 3 name"); 
    	     String str3=s.nextLine();
    	     System.out.println("enter subject 1 marks"); 
    	     int m1=s.nextInt();
    	     System.out.println("enter subject 2 marks"); 
    	     int m2=s.nextInt();
    	     System.out.println("enter subject 3 marks"); 
    	     int m3=s.nextInt();
    	     int avg=0;
    	     if((m1<=m2)&&(m1<=m3)){
    	    	 System.out.println("best 2 are:"+str2+" "+str3);
    	    	 avg=(m2+m3)/2;}
    	     else if((m2<=m1)&&(m2<=m3)){
    	    	 System.out.println("best 2 are:"+str1+" "+str3);
    	    	 avg=(m1+m3)/2;}
    	     else if((m3<=m2)&&(m3<=m1)){
    	    	 System.out.println("best 2 are:"+str2+" "+str1);
    	    	  avg=(m2+m1)/2;}
    	     System.out.println("average of best 2:"+avg);

    	    	 
    	     
    	     
    	     
       
	}

}
