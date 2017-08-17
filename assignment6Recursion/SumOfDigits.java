package assignment6Recursion;

import java.util.Scanner;

public class SumOfDigits {
	
	public static int sumDigits(int n){
		if(n==0)
			return 0;
		int sum=sumDigits(n/10);
		int r=n%10;
		return r+sum;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);
        System.out.println("enter n");
        int n=s.nextInt();
        System.out.println(sumDigits(n));
	}

	}


