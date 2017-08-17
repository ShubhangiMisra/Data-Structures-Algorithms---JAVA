package assignment3Array;

import java.util.Scanner;

public class FindDuplicateNum {
	public static int findDuplicate(int[]input){
		for(int i=0;i<=input.length-1;i++){
			for(int j=i+1;j<=input.length-1;j++){
				if(input[i]==input[j]){
					return input[i];	
				}

			}
		}
		return -1;


	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int input[]={1,2,5,1,3,4};
		System.out.println(findDuplicate(input));

	}

}
