package assignment8Recursion;

import java.util.Scanner;

public class StaircaseClimb {
	public static int waysToClimb(int n){
		if(n==0||n==1){
			return 1;
		}
		int smallAns1=waysToClimb(n-1);
		int smallAns2=waysToClimb(n-2);
		
		if(n==2){
			return smallAns1+smallAns2;
		}
		int smallAns3=waysToClimb(n-3);
		return smallAns1+smallAns2+smallAns3;
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);
		System.out.println("enter no. of stairs");
		int n=s.nextInt();
		System.out.println(waysToClimb(n));

	}

}
