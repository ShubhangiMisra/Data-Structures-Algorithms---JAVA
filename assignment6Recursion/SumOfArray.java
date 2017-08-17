package assignment6Recursion;

import java.util.Scanner;

public class SumOfArray {
	
	public static int sumArray(int[]input,int beginIndex){
		if(beginIndex==input.length-1)
			return input[beginIndex];
		int sum=sumArray(input,beginIndex+1);
		return sum+input[beginIndex];
		
		
	}
	
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
		
		int arr[]=takeInput();
		System.out.println(sumArray(arr,0));

	}

}
