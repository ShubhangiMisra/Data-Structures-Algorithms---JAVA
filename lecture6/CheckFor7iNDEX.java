package lecture6;

import java.util.Scanner;

public class CheckFor7iNDEX {
	
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
	
	public static boolean checkFor7(int[]input,int beginIndex){
		if((beginIndex==input.length-1)&&(input[beginIndex]!=7)){
			return false;}
		if (input[beginIndex]==7)
				return true;
		return checkFor7(input,beginIndex+1);
		
		}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[]=takeInput();
         System.out.println(checkFor7(arr,0));
	}

}
