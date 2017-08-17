package assignment6Recursion;

import java.util.Scanner;

public class NoOfZeroes {
	
	public static int count(int n){
		if (n==0){
			return 0;}
		 //count(n/10);
		int r=(n%10);
		int smallResult = count(n/10);
		if (r==0){
			return smallResult+1;
		}
		else return smallResult;
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);
        System.out.println("enter n");
        int n=s.nextInt();
        System.out.println(count(n));
	}

}
