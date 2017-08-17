package assignment4Arrays;

import java.util.Scanner;

public class SortedArrayRotatedK {
	public static  int[] takeInput(){
		Scanner s= new Scanner(System.in);
		System.out.println("enter size of array");
		int size=s.nextInt();
		int arr[]=new int[size];
		for(int i=0;i<size;i++){
			System.out.println("enter"+i+"element");
			arr[i]=s.nextInt();
		}return arr;}
	
	public static int findRotationK(int input[]){
		
		for(int i=0;i<=input.length-1;i++){
			if (input[i]>input[i+1])
				return i+1;
		}
		return 0;
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[]=takeInput();
		System.out.println(findRotationK(arr));

	}

}
