package lecture6;

import java.util.Scanner;

public class LastIndex7 {
	
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
	
	public static int lastIndex(int []input,int endIndex){
		if ((endIndex==0)&&input[endIndex]!=7)
			return -1;
		if (input[endIndex]==7)
			return endIndex;
		return lastIndex(input,endIndex-1);
				
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int arr[]=takeInput();
		System.out.println(lastIndex(arr,arr.length-1));
	}

}
