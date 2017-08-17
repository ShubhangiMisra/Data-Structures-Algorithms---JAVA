package final_lecture;

import java.util.Scanner;

public class CombinationsWellFormedParenthesis { 
	 public static void combinations(int n,int open,int closed,String outputSoFar){
		 if(closed==n){
			 System.out.println(outputSoFar);
			 return;
		 }
		 if(open!=n){
			 combinations(n, open+1, closed, outputSoFar+"(");
		 }
		 if(closed!=n){
			 combinations(n, open, closed+1, outputSoFar+")");
		 }
		 
	 }
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);
		System.out.println("enter n");
		int n=s.nextInt();
		combinations(n,0,0,"");
		
		

	}

}
