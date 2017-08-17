package assignment4Arrays;

import java.util.Scanner;

public class ReturnIntersectionArray {
	public static int count(int input[],int n){
		int count=0;
		for(int i=0;i<input.length;i++){
			if(input[i]==n){
				count++;
			}
		}
		return count; 
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

	public static int[] intersection(int[]arr1 ,int[]arr2){
		int min;
		if()

		for(int i=0;i<arr1.length;i++){
			boolean ans=false;
			for (int k=0;k<i;k++){
				if (arr1[k]==arr1[i]){
					ans=true;
					break;
				}
			}
			if (ans==false){
	
				int a1=count(arr1,arr1[i]);
				int a2=count(arr2,arr1[i]);
				if(a1<a2)
					min=a1;
				else
					min=a2;
				for(int j=1;j<=min;j++){
					System.out.print(arr1[i]+" ");	
				}
			}
		}
		
	public static void printArray(int[] input){
		for(int i=0;i<input.length;i++){
			System.out.print(input[i]+" ");
		}
	}
		

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr1[]=takeInput();
		int arr2[]=takeInput();
		printArray(intersection(arr1,arr2));

	}

}
