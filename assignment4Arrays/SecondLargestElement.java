package assignment4Arrays;

import java.util.Scanner;

public class SecondLargestElement {
	
	public static  int[] takeInput(){
		Scanner s= new Scanner(System.in);
		System.out.println("enter size of array");
		int size=s.nextInt();
		int arr[]=new int[size];
		for(int i=0;i<size;i++){
			System.out.println("enter"+i+"element");
			arr[i]=s.nextInt();
		}return arr;}
	
	public static int secondL(int input[]){
		for(int i=0;i<2;i++){
			for(int j=0;j<input.length-1-i;j++){
				if(input[j]>input[j+1]){
					int temp=input[j];
					input[j]=input[j+1];
					input[j+1]=temp;
				}
			}
		}
		return input[input.length-2];
	}
	
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[]=takeInput();
		System.out.println(secondL(arr));

	}

}
