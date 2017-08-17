package lecture6;

import java.util.Scanner;

public class Factorial {
	
	public static int fact(int n){
		if (n==0){
			return 1;}
		return n*fact(n-1);
		
			
		}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s= new Scanner(System.in);
	     System.out.println("enter num ");
	     int n = s.nextInt();
	     System.out.println(fact(n));
	}

}
