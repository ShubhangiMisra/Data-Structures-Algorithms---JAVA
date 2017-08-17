package lecture8;

import java.util.Scanner;

public class Merge2SortedArrays {

	public static int[] merge2SortedArrays(int[]a,int[]b){
		int arr[]=new int[a.length+b.length];
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
			i++;}
		}








		return arr;

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

		int arr1[]=takeInput();
		int arr2[]=takeInput();
		printArray(merge2SortedArrays(arr1,arr2));
	}

}
