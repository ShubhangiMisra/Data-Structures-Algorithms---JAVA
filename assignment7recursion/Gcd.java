package assignment7recursion;

import java.util.Scanner;

public class Gcd {
	
	public static int gcd(int a,int b){
		if (a>b){
			if (b==1) 
				return b;
			int gcdSmall=gcd(a,b-1);
			if (a%b==0)
				return b;
			else return gcdSmall;
		}
		else {
			if (a==1) 
				return a;
			int gcdSmall=gcd(a-1,b);
			if (b%a==0)
				return a;
			else return gcdSmall;
			
			
		}
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner s=new Scanner(System.in);
		System.out.println("enter no. 1");
		int a=s.nextInt();
		System.out.println("enter no. 2");
		int b=s.nextInt();
		System.out.println(gcd(a,b));
	}

	}


