package lecture6;

import java.util.Scanner;

public class MINelementArrayRecursion {
	
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
	
	public static int minElement(int input[]){
		if (input.length==1)
			return input[0];
		if (input.length==0)
		return Integer.MAX_VALUE;
		int smallInput[]= new int[input.length-1];
		
		for(int i=1;i<=input.length-1;i++){
			smallInput[i-1]=input[i];
		}
		int min=minElement(smallInput);
		if (min>input[0]){
			min=input[0];	
		}
		return min;
		
	    
			
		}
		
		
	
		
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        int arr[]=takeInput();
        System.out.println(minElement(arr));
	}

}
