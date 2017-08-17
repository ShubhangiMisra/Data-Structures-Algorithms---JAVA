package Assignment5Strings2dArrays;

import java.util.Scanner;

public class Rotate2DArray90_degree {

	public static int[][] takeInput2D(){
		Scanner s=new Scanner(System.in);
		System.out.println("enter num rows");
		int numRows=s.nextInt();
		System.out.println("enter num columns");
		int numColumns=s.nextInt();
		int arr[][]=new int[numRows][numColumns];
		for(int i=0;i<numRows;i++){
			for(int j=0;j<numColumns;j++){
				System.out.println("enter element of "+i+"row "+j+"column");
				arr[i][j]=s.nextInt();
			}
		}
		return arr;			
	}
	
	public static void print2D(int [][]arr){
		for(int i=0;i<arr.length;i++){
			for(int j=0;j<arr[0].length;j++){
				System.out.print(arr[i][j]+" ");	
			}
			System.out.println();
		}	
	}
	public static int[][] rotate(int [][] input){
		int rotated[][]=new int[input[0].length][input.length];
		for(int row=0;row<input[0].length;row++){
			for(int col=0;col<input.length;col++){
				rotated[row][input.length-1-col]=input[col][row];
			}
		}
		return rotated;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[][]=takeInput2D();
		print2D(rotate(arr));

	}

}
