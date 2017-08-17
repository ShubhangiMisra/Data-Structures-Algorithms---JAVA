package lecture5;

import java.util.Scanner;

public class SumOfInput2DArray {
	
	public static int[][] takeInput2d(){
		Scanner s=new Scanner(System.in);
		System.out.println("enter num rows");
		int numRows=s.nextInt();
		System.out.println("enter num columns");
		int numCols=s.nextInt();
		int[][] input=new int[numRows][numCols];
		for (int i=0;i<numRows;i++){
			for (int j=0;j<numCols;j++){
				System.out.println("enter value of"+i+"row and"+j+"column");
				input[i][j]=s.nextInt();
			}
		}
		return input;
	}
	public static int sum2Darray(int [][] input){
		int sum=0;
		for (int i=0;i<input.length;i++){
			for (int j=0;j<input[0].length;j++){
				sum+=input[i][j];
				
			}
		}
		return sum;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       int arr[][]=takeInput2d();
       int sum=sum2Darray(arr);
       System.out.println(sum);
       
	}

}
