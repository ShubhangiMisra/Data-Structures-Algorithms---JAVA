package lecture8;

import java.util.Scanner;

public class MergeSort {

	public static void mergeSort(int[]input){
		if(input.length<=1){
			return;
		}
		int size1=input.length/2;
		int size2=input.length-size1;
		int part1[]=new int[size1];
		int part2[]=new int[size2];


		for(int i=0;i<=size1-1;i++){
			part1[i]=input[i];

		}
		for(int i=size1;i<input.length;i++){
			part2[i-size1]=input[i];
		}



		mergeSort(part1);
		mergeSort(part2);
		merge2SortedArrays(part1,part2,input);
	}

	public static void merge2SortedArrays(int[]a,int[]b,int[] arr){
		//		int arr[]=new int[a.length+b.length];
		int size=a.length+b.length;
		int i=0;
		int j=0;
		int z=0;


		while (i<=a.length-1 && j<=b.length-1) {
			if (a[i]<=b[j]){
				arr[z]=a[i];
				i++;
				z++;}
			else {arr[z]=b[j];
			j++;
			z++;}
		}
		if (i==a.length){
			for(int k=z;k<=size-1;k++){
				arr[k]=b[j];
				j++;}
		}
		else {for(int k=z;k<=size-1;k++){
			arr[k]=a[i];
			i++;}}


	}
	public static  int[] takeInput(){
		Scanner s= new Scanner(System.in);
		System.out.println("enter size of array");
		int size=s.nextInt();
		int arr[]=new int[size];
		for(int i=0;i<size;i++){
			System.out.println("enter"+i+"element");
			arr[i]=s.nextInt();
		}return arr;}

	public static void printArray(int[] input){
		for(int i=0;i<input.length;i++){
			System.out.print(input[i]);
		}}




	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[]input={5,1,7,2,4};
		mergeSort(input);
		for(int i=0;i<input.length;i++){
			System.out.println(input[i]);
		}




	}

}
