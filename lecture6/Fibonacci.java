package lecture6;

import java.util.Scanner;

public class Fibonacci {
	
	public static int fibo(int n){
		if((n==0)||(n==1)){
			return n;}
		return fibo(n-1)+fibo(n-2);	
			
		}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner s= new Scanner(System.in);
	     System.out.println("enter num ");
	     int n = s.nextInt();
	     System.out.println(fibo(n));
	}

}
