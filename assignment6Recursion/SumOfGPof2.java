package assignment6Recursion;

import java.util.Scanner;

public class SumOfGPof2 {
	
	public static double gpSum2(int k){
		if(k==0)
			return 1;
		double sum=gpSum2(k-1);
		return sum+Math.pow(0.5, k);
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);
        System.out.println("enter n");
        int n=s.nextInt();
        System.out.println(gpSum2(n));
	}

}
