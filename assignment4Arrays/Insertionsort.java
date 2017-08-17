package assignment4Arrays;

import java.util.Scanner;

public class Insertionsort {

	public static  int[] takeInput(){
		Scanner s= new Scanner(System.in);
		System.out.println("enter size of array");
		int size=s.nextInt();
		int arr[]=new int[size];
		for(int i=0;i<size;i++){
			System.out.println("enter"+i+"element");
			arr[i]=s.nextInt();
		}return arr;}

	public static void printArray(int[] input){
		for(int i=0;i<input.length;i++){
			System.out.print(input[i]);
		}
	}
	public static int[] insertion(int[]input){
		for(int i = 1; i < input.length; i++){
			int temp=input[i];
			int j;
//			temp = j;
			for(j=i-1;j>=0;j--){
				if(temp<input[j]){
					input[j+1]=input[j];
				}else{
					break;
				}
			}

			input[j+1]=temp;
		}

		return input;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//int arr[]=takeInput();
		int arr[] = {2,3,0,8,0,2};
		printArray(insertion(arr));
	}

}
