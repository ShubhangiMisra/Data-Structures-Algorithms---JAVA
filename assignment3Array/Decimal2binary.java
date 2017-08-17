package assignment3Array;

import java.util.Scanner;

public class Decimal2binary {
	
	public static int[] decimal2binary(int n){
		int size=0;
		int q=n;
		while(q!=0){
			q/=2;
			size++;
		}
		int arr[]=new int[size];
		for(int i=size-1;i>=0;i--){
			arr[i]=n%2;
			n/=2;
		}
		return arr;
	}
	
	public static void printArray(int[] input){
		for(int i=0;i<input.length;i++){
			System.out.print(input[i]);
		}}
	
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		  Scanner s= new Scanner(System.in);
	         System.out.println("enter n");
	         int n=s.nextInt();
	         printArray(decimal2binary(n));
	         

	}

}
