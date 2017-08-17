package assignment4Arrays;

import java.util.Scanner;

public class SortArrayWith0_1_2s {
	public static int count(int input[],int n){
	 int count=0;
	 for(int i=0;i<input.length;i++){
		 if(input[i]==n)
			 count++;
	 }
	 return count;
	}


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
	public static int[] sort(int[]input){
		int i=0,nextZero=0,nextOne=0;
		while(i<input.length && input[i]==0){
			i++;
		}
		nextZero=i;
		int count=count(input,0)-1;
		while(i<input.length && nextZero<=count){
			while(i<input.length-1 && input[i]!=0){
				i++;
			}
			int temp=input[i];
			input[i]=input[nextZero];
			input[nextZero]=temp;
			nextZero++;
		}	
		i=nextZero;
		
	while(i<input.length && input[i]==1){
		i++;
	}
	nextOne=i;
	while(i<input.length){
		while(i<input.length-1 && input[i]==2){
			i++;
		}
		int temp=input[i];
		input[i]=input[nextOne];
		input[nextOne]=temp;
		nextOne++;
		i++;
	}
	return input;
	}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int input[]=takeInput();
		printArray(sort(input));

	}

}
