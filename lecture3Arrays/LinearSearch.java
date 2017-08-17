package lecture3Arrays;

import java.util.Scanner;

public class LinearSearch {
	public static  int[] takeInput(){
		Scanner s= new Scanner(System.in);
		System.out.println("enter size of array");
		int size=s.nextInt();
		int arr[]=new int[size];
		for(int i=0;i<size;i++){
			System.out.println("enter"+i+"element");
			arr[i]=s.nextInt();
		}return arr;}
	
	public static void linearSearch(int []input,int n){
		int i=0,count=0;
		for( i=0;i<input.length;i++){
			if (input[i]==n){
				System.out.println(i);
				count+=1;
				
			}
			
			}
		if (count==0)
		
		System.out.println("not present");
		
		
		
		
		
	
		
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s= new Scanner(System.in);
		System.out.println("enter no. to search");
		int n=s.nextInt();
		int arr[]=takeInput();
		linearSearch(arr,n);
		
	}

}
