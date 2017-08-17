package assignment2b;

import java.util.Scanner;

public class PrintSeries{
	public static void printSeries(int n){
		for(int i=1;i<=n;i++){
			 int r=3*i+2;
			if (r%4!=0)
				System.out.println(r);
			
		}
	}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        
        Scanner s= new Scanner(System.in);
		System.out.println("enter n");
		int n=s.nextInt();
		printSeries(n);
	}

}
