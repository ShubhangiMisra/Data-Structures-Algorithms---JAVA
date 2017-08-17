package assignment6Recursion;

import java.util.Scanner;

public class ProductUsingRecursion {
	
	public static int prod(int m,int n){
		if (n==1)
			return m;
		return m+prod(m,n-1);
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
         Scanner s=new Scanner(System.in);
         System.out.println("enter m");
         int m=s.nextInt();
         System.out.println("enter n");
         int n=s.nextInt();
         System.out.println(prod(m,n));
         
	}

}
