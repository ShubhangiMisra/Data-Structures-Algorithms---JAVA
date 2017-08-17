package assignment3Array;

import java.util.Scanner;

public class SortArray0and1s {
	public static int[] takeInput(){
		Scanner s= new Scanner(System.in);
		System.out.println("enter size of array");
		int size=s.nextInt();
		int arr[]=new int[size];
		for(int i=0;i<size;i++){
			System.out.println("enter"+i+"element");
			arr[i]=s.nextInt();
		}
		return arr;
	}

	public static void printArray(int[] input){
		for(int i=0;i<input.length;i++){
			System.out.print(input[i]);
		}
	}

	public static int[] sort(int[] input){
		int nextZero=0;
		int i=0;

		while(i<input.length && input[i]==0){
			i++;
		}
		nextZero=i;
		while(i<input.length){
			while( i<input.length-1 &&input[i]==1 ){
				i++;
			}
			
				int temp=input[i];
				input[i]=input[nextZero];
				input[nextZero]=temp;
				nextZero++;	
				i++;
			
		}
		return input;
	}


	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[]=takeInput();
		printArray(sort(arr));


	}

}
