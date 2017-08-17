package lecture3Arrays;

import java.util.Scanner;

public class LargestElementOfArray {
	public static  int[] takeInput(){
		Scanner s= new Scanner(System.in);
		System.out.println("enter size of array");
		int size=s.nextInt();
		int arr[]=new int[size];
		for(int i=0;i<size;i++){
			System.out.println("enter"+i+"element");
			arr[i]=s.nextInt();
		}return arr;}
	
	public static int largestElement(int [] input){
		int max= Integer.MIN_VALUE;
		
		for(int i=0;i<input.length;i++){
			if (input[i]>=max)
				max=input[i];
			
		}return max;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        int arr[]=takeInput();
        int n=largestElement(arr);
        System.out.println(n);
	}

}
