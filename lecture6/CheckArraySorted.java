package lecture6;

import java.util.Scanner;

public class CheckArraySorted {
	
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
	
	public static boolean Sorted(int[]input){
		if (input.length==1)
			return true;
		if (input[0]>input[1]){
			return false;}
		int arr[]=new int[input.length-1];
		for(int i=1;i<=input.length-1;i++){
			arr[i-1]=input[i];}
		return Sorted(arr);
			
			
		}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
         int arr[]=takeInput();
         System.out.println(Sorted(arr));
	}

}
