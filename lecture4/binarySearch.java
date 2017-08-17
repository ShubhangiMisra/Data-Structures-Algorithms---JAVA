package lecture4;

import java.util.Scanner;

public class binarySearch {
	public static int[] takeInput(){
		Scanner s= new Scanner(System.in);
		System.out.println("enter size");
		int size=s.nextInt();
		int input[]=new int[size];
		int i;
		for (i=0;i<size;i++){
		   System.out.println("enter"+i+"element");
		   input[i]=s.nextInt();
		   ;
		}
		return input;
}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       int a[]=takeInput();
       Scanner s= new Scanner(System.in);
       System.out.println("enter n");
       int n=s.nextInt();
       int index= binarySearch_1(a,n);
       System.out.println("index is"+index);
       
    		   
       
	}
	public static int binarySearch_1(int []input,int n){
		
		int s=0,end=input.length-1;
		
		while (s<=end){
			int mid=(s+end)/2;
			if (n==input[mid]){
//				int index=mid;
				return mid;
				
			}
			else if (n>input[mid]){
				s=mid+1;
			}
			else {
				end=mid-1;
				
				
			}
		}
		return -1;
		
		
		
	}
       
}
