package assignment2b;

import java.util.Scanner;

public class DecimaL2binary {
	public static void decimalToBinary(int n){
		int bin=0,i=0;
		int q=n;
		while (q!=0){
			int r=q%2;
			bin+=r*Math.pow(10, i);
			i++;
			q/=2;
		}System.out.println(bin);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s= new Scanner(System.in);
		System.out.println("enter n");
		int n=s.nextInt();
		decimalToBinary(n);
		
	}

}
