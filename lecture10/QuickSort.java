package lecture10;

import java.util.Scanner;

public class QuickSort {
	public static int[] takeInput(){
		Scanner s= new Scanner(System.in);
		System.out.println("enter size of array");
		int size=s.nextInt();
		int arr[]=new int[size];
		for(int i=0;i<size;i++){
			System.out.println("enter"+i+"element");
			arr[i]=s.nextInt();
		}return arr;}

	public static void quickSort(int input[],int begin,int end){
		if(begin>=end){
			return;
		}
		int pivotPos=partition(input,begin,end);
		quickSort(input,begin,pivotPos-1);
		quickSort(input,pivotPos+1,end);
	}

	public static int partition(int input[],int begin,int end){
		int count=0;

		for(int i=begin+1;i<=end;i++){
			if(input[begin]>=input[i]){
				count+=1;
			}
		}
		int pivotPos=begin+count;
		int temp=input[begin];
		input[begin]=input[pivotPos];
		input[pivotPos]=temp;

		while(begin<pivotPos && end>pivotPos){
			//begin;

						while( begin<pivotPos && input[begin]<=input[pivotPos]){
							begin++;
			
						}
			             
			
						while(end>pivotPos && input[end]>input[pivotPos]){
							end--;
						}
//			if(input[begin]<=input[pivotPos]){
//				begin++;
//			}
//			if(input[end]>input[pivotPos]){
//				end--;
//			}
//			if(input[begin]>input[pivotPos] && input[end]<=input[pivotPos]){
				int temp1=input[begin];
				input[begin]=input[end];
				input[end]=temp1;
				begin++;
				end--;
			
		}
		return pivotPos;

	}
	public static void printArray(int[] input){
		for(int i=0;i<input.length;i++){
			System.out.print(input[i]+"   ");
		}}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[]=takeInput();
		quickSort(arr,0,arr.length-1);
		printArray(arr);


	}

}
