package assignment3Array;

import java.util.Scanner;

public class PairsWithSumX {
	public static int[] takeInput(){
		Scanner s= new Scanner(System.in);
		System.out.println("enter size of array");
		int size=s.nextInt();
		int arr[]=new int[size];
		for(int i=0;i<size;i++){
			System.out.println("enter"+i+"element");
			arr[i]=s.nextInt();
		}return arr;}
	
	public static void pairsWithSumX(int input[],int x){
		for (int i=0;i<=input.length-1;i++){
			for(int j=i+1;j<=input.length-1;j++){
				if (input[i]+input[j]==x){
					System.out.println(input[i]+","+input[j]);
				}
			}
		}
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
         Scanner s= new Scanner(System.in);
         System.out.println("enter n");
         int n=s.nextInt();
         int arr[]=takeInput();
         pairsWithSumX(arr,n);
         
	}

}
