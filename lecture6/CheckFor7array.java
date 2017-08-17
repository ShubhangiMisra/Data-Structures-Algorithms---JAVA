package lecture6;

import java.util.Scanner;

public class CheckFor7array {
	
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
	
	public static boolean checkFor7(int[]input){
		 if ((input.length==1) && (input[0]!=7)){
			 return false;}
		if (input[0]==7){
			return true;
		}
		
			 int smallInput[]=new int [input.length-1];
			 for(int i=1;i<=input.length-1;i++){
				 
				 
					smallInput[i-1]=input[i];
				}
		 
			 
			 return checkFor7(smallInput);
		 }
	
		
	
	
	  

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        int arr[]=takeInput();
        boolean ans=checkFor7(arr);
        System.out.println(ans);
        
	}

}
