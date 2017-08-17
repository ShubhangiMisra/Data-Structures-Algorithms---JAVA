package lecture10;

import java.util.Scanner;

public class PairsWithSumXARRAY {

	public static int[] takeInput(){
		Scanner s= new Scanner(System.in);
		System.out.println("enter size of array");
		int size=s.nextInt();
		int arr[]=new int[size];
		for(int i=0;i<size;i++){
			System.out.println("enter"+i+"element");
			arr[i]=s.nextInt();
		}return arr;}

	public static void sumX(int input[],int x){
		int i=0;
		int j=input.length-1;
		while(i<j){
			int sum=input[i]+input[j];
			if(sum>x)
				j--;
			if(sum<x)
				i++;
			else{
				System.out.println(input[i]+","+input[j]);
				i++;
				j--;
			}
		}
	}
	



			public static void main(String[] args) {
				// TODO Auto-generated method stub

				Scanner s= new Scanner(System.in);
				System.out.println("enter n");
				int n=s.nextInt();
				int arr[]=takeInput();
				sumX(arr,n);

			}

		

	}


