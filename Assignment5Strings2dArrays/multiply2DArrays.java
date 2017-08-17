package Assignment5Strings2dArrays;

import java.util.Scanner;

public class multiply2DArrays {
	
	
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
	public static int[][] multiply2DArray(int arr1[][],int arr2[][]){
		int[][]prodArr=new int[arr1.length][arr2[0].length];
		for(int rowFirst=0;rowFirst<arr1.length;rowFirst++){
			for(int colSecond=0;colSecond<arr2[0].length;colSecond++){
				int sum=0;
				for(int i=0;i<arr1[0].length;i++){
					sum+=arr1[rowFirst][i]*arr2[i][colSecond];
				}
				prodArr[rowFirst][colSecond]=sum;
			}
		}
		return prodArr;
	}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       int arr1[][]=takeInput2D();
       int arr2[][]=takeInput2D();
       print2D(multiply2DArray(arr1, arr2));
       
       
	}

}
