package lecture4;

import java.util.Scanner;

public class bubbleSort {
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

	public static int[] bubbleSort2(int[] inpu){
		for (int j=0;j<=inpu.length-2;j++){
			for(int i=0;i<=inpu.length-2-j;i++){
				if (inpu[i]>inpu[i+1]){
					int temp=inpu[i];
					inpu[i]=inpu[i+1];
					inpu[i+1]=temp;
				}
			}
			

		}
		return inpu;
	}
	public static void printArray(int[] inp){
		for(int i=0;i<inp.length;i++){
			System.out.print(inp[i]);
		}
	}












	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int []arr=takeInput();
		int bubble[]=bubbleSort2(arr);
		printArray(bubble);


	}

}
