package assignment3Array;

import java.util.Scanner;

public class SumOf2arrays {

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

	public static int[] sum(int arr1[],int arr2[]){
		int size=0;

	
	int carry=0,minSize=0,maxSize=0;
	int min[]=new int[minSize];
	int max[]=new int [maxSize];
	if(arr1.length>arr2.length){
		min=arr2;
		max=arr1;
	}
	else{
		min=arr1;
		max=arr2;
	}
	int sumA[]=new int[max.length+1];

	for(int i=min.length-1;i>=0;i--){
		int sum=min[i]+max[max.length-min.length+i]+carry;
		int r=sum%10;
		sumA[max.length-min.length+i+1]=r;
		carry=sum/10;
	}
	for(int j=max.length-1-min.length;j>=0;j--){
		int sum=max[j]+carry;
		int r=sum%10;
		sumA[j+1]=r;
		carry=sum/10;
	
	}
	

	sumA[0]=carry;
	return sumA;
}


public static void printArray(int[] input){
	for(int i=0;i<input.length;i++){
		System.out.print(input[i]);
	}
	}

public static void main(String[] args) {
	// TODO Auto-generated method stub
//
	int arr1[]=takeInput();
	int arr2[]=takeInput();
	printArray(sum(arr1, arr2));
	


}	

}
