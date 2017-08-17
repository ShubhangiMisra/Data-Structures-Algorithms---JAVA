package assignment4Arrays;

import java.util.Scanner;

public class TripletsSummingToX {
	public static int[] takeInput(){
		Scanner s= new Scanner(System.in);
		System.out.println("enter size of array");
		int size=s.nextInt();
		int arr[]=new int[size];
		for(int i=0;i<size;i++){
			System.out.println("enter"+i+"element");
			arr[i]=s.nextInt();
		}
		return arr;
	}
	public static void triplet(int input[],int x){
		for(int i=0;i<input.length;i++){
			for(int j=i+1;j<input.length;j++){
				for(int k=j+1;k<input.length;k++){
					if(input[i]+input[j]+input[k]==x){
						System.out.println(input[i]+","+input[j]+","+input[k]);
					}
				}
			}
		}
	}
	
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int input[]=takeInput();
		Scanner s=new Scanner(System.in);
		System.out.println("enter x");
		int x=s.nextInt();
		triplet(input,x);

	}

}
