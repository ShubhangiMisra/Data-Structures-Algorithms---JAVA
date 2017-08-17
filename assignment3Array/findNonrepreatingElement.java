package assignment3Array;

import java.util.Scanner;

public class findNonrepreatingElement {
	
	public static int[] takeInput(){
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
		}}
	
	public static void nonRepeating(int input[]){
		for (int i=0;i<input.length;i++){
			int count=0;
			for (int j=0;j<input.length;j++){
				if(input[i]==input[j]){
					count+=1;
				}
			}
			if (count==1)
				{System.out.println(input[i]);
			break;}

		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[]=takeInput();
		nonRepeating(arr);

	}

}
