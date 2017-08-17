package lecture4;

import java.util.Scanner;

public class SelectionSort {

	public static  int[] takeInput(){
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
	public static int[] selection(int input[]){
		
		for(int i=0;i<=input.length-2;i++){
			int min=Integer.MAX_VALUE;
			int minIndex=0;
			int j=0;
			for(j=i;j<=input.length-1;j++){
				if(min>input[j]){
					min=input[j];
					minIndex=j;
			}
			}
			if (input[minIndex]!=input[i]){
				int temp=input[i];
				input[i]=input[minIndex];
				input[minIndex]=temp;
			}
		}return input;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[]=takeInput();
		printArray(selection(arr));

	}

}
