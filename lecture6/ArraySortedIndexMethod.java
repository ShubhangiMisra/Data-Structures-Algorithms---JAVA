package lecture6;

import java.util.Scanner;

public class ArraySortedIndexMethod {
	
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
		return input;
	}
	
	public static boolean Sorted(int input[],int beginIndex){
		if (beginIndex==input.length-1){
			return true;}
		if(input[beginIndex]>input[beginIndex+1]){
			return false;}
		return Sorted(input,beginIndex+1);

			
		}
		
		
		
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s= new Scanner(System.in);
		System.out.println("enter index");
		int n=s.nextInt();
		
		
		 int arr[]=takeInput();
         System.out.println(Sorted(arr,n));
	}

}
