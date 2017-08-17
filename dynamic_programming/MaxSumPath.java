package dynamic_programming;

import java.util.HashMap;

import lecture3Arrays.ArrayInput;

public class MaxSumPath {

	public static int maxSum(int arr1[],int arr2[]){
		int sum=0;
		int i=0,j=0;
		while(i<arr1.length && j<arr2.length){
			int sumA=0,sumB=0;

			while(arr1[i]!=arr2[j]){
				if(arr1[i]<arr2[j]){
					sumA+=arr1[i];
					sumB+=arr2[j];
					i++;
				}
				else{
					sumA+=arr1[i];
					sumB+=arr2[j];
					j++;
				}
			}
			sum+=Integer.max(sumA, sumB);

		}
		return sum;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr1[]=ArrayInput.takeInput();
		int arr2[]=ArrayInput.takeInput();
		System.out.println(maxSum(arr1, arr2));



	}

}
