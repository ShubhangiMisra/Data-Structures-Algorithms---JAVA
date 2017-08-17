package assignment3Array;

import java.util.Scanner;

public class SumOfPosNegNosArray {
	
	public static int[] takeInput(){
	Scanner s= new Scanner(System.in);
	System.out.println("enter size of array");
	int size=s.nextInt();
	int arr[]=new int[size];
	for(int i=0;i<size;i++){
		System.out.println("enter"+i+"element");
		arr[i]=s.nextInt();
	}return arr;}
	
	public static void sumOfPosNegnos(int input[]){
		int pos=0,negtv=0;
		for(int i=0;i<=input.length-1;i++){
			if (input[i]>=0)
				pos+=input[i];
			else negtv+=input[i];
		}
		System.out.println("possum:"+pos+"\n negsum:"+negtv);
			
		}
		
		
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[]=takeInput();
		sumOfPosNegnos(arr);
	}

}
