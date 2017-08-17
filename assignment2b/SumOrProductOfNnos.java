package assignment2b;

import java.util.Scanner;

public class SumOrProductOfNnos {
	
	public static void sum1(int n){
		int sum=0;
		for (int i=1;i<=n;i++){
			sum+=i;}
			System.out.println(sum);
			
		}

	public static void product1(int n){
		int prod=1;
		for (int i=1;i<=n;i++){
			prod*=i;
			}
			System.out.println(prod);
	}

	
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s= new Scanner(System.in);
		System.out.println("enter n");
		int n=s.nextInt();
	    System.out.println("enter s for sum, p for product");
	    char str=s.next().charAt(0);
	    if (str == 'p')
	    	product1(n);
	    else if (str=='s')
	    	sum1(n);
	
}
}

	
