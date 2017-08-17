package assignment4Arrays;

import java.util.Scanner;

public class TripletsEqualToX {
	public static int[] takeInput(){
		Scanner s= new Scanner(System.in);
		System.out.println("enter size");
		int size=s.nextInt();
		int input[]=new int[size];
		int i;
		for (i=0;i<size;i++){
			System.out.println("enter"+"element");
			input[i]=s.nextInt();

		}
		return input;}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
