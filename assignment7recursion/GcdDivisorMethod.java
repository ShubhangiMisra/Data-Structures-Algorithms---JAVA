package assignment7recursion;

import java.util.Scanner;

public class GcdDivisorMethod {
	
	public static int gcd2(int num1,int num2){
		if (num1%num2==0)
			return num2;
		int gcd=gcd2(num2,num1%num2);
		return gcd;
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);
		System.out.println("enter no. 1");
		int a=s.nextInt();
		System.out.println("enter no. 2");
		int b=s.nextInt();
		System.out.println(gcd2(a,b));

	}

}
