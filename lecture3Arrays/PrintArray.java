package lecture3Arrays;

import java.util.Scanner;

public class PrintArray {
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
			System.out.print(input[i]+" ");
		}
		
		
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
          int arr[]=takeInput();
          printArray(arr);
          
	}

}
