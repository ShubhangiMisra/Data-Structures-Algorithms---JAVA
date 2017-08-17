package assignment4Arrays;

import java.util.Scanner;

public class ArrayWith0_1_2_2ndWay {

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
	public static int[] sort(int input[]){
		int i=0,nextOne=0,nextZero=0;
		
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int input[]=takeInput();
		printArray(sort(input));


	}

}
