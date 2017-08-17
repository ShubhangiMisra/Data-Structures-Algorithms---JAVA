package Assignment5Strings2dArrays;

import java.util.Scanner;

public class SortStringArray {
	public static  String[] takeInput(){
		Scanner s= new Scanner(System.in);
		System.out.println("enter size of array");
		int size=s.nextInt();
		String arr[]=new String[size];
		for(int i=0;i<size;i++){
			System.out.println("enter"+i+"element");
			arr[i]=s.next();
		}
		return arr;
	}
	public static String[] bubbleSort2(String[] inpu){
		for (int j=0;j<=inpu.length-2;j++){
			for(int i=0;i<=inpu.length-2-j;i++){
				if (inpu[i].length()>inpu[i+1].length()){
					String temp=inpu[i];
					inpu[i]=inpu[i+1];
					inpu[i+1]=temp;
				}
			}
		}return inpu;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String arr[]=takeInput();
		String sort[]=bubbleSort2(arr);
		for(int i=0;i<=arr.length-1;i++){
			System.out.println(arr[i]);
		}

	}

}
