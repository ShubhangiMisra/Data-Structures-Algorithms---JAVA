package lecture5;

import java.util.Scanner;

public class RowColumnMaxSum2DArray {
	
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
	
	public static void LargestRowOrColumn(int input[][]){
		int maxRow=Integer.MIN_VALUE;
		int maxColumn=Integer.MIN_VALUE;
		for(int i=0;i<input.length;i++){
			int sum=0;
			for (int j=0;j<input[0].length;j++){
				sum+=input[j][i];
			}   
			   if (sum>=maxRow){
				   maxRow=sum;
				   System.out.println(i);
			   }
		} System.out.println(maxRow);
	
		for(int i=0;i<input[0].length;i++){
			int sum=0;
			for (int j=0;j<input.length;j++){
				sum+=input[i][j];
			}   
			   if (sum>=maxColumn){
				   maxColumn=sum;
				   System.out.println(i);
			   }
		} System.out.println(maxColumn);
		 if (maxColumn>=maxRow){
			 System.out.println("MAX COLUMN SUM IS:"+maxColumn);
		 }else System.out.println(maxRow);
		 }

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       int arr[][]=takeInput2d();
       LargestRowOrColumn(arr);
	}

}
