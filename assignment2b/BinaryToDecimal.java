package assignment2b;

import java.util.Scanner;

public class BinaryToDecimal {
	public static void binary2decimal(int n){
		int q=n;
		int i=0,decml=0;;
		while (q!=0){
			int r=q%10;
			decml+=r*Math.pow(2, i);
			i++;
			q/=10;
			
		}System.out.println(decml);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s= new Scanner(System.in);
		System.out.println("enter n");
		int n=s.nextInt();
		binary2decimal(n);
	}

}
