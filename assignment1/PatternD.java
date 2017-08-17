package assignment1;

import java.util.Scanner;

public class PatternD {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);
		System.out.println("enter odd no. of rows");
		int n=s.nextInt();
		int n1=n/2+1;
		int n2=n/2;
		
		
		for(int row=1;row<=n1;row++){
			for (int col=1;col<=n1-row;col++){
				System.out.print(" ");
			}
			for(int r=1;r<=2*row-1;r++){
				if(r%2==0)
					System.out.print("*");
				else 
					System.out.print(" ");
			}
			System.out.println();
		}
		for (int row=1;row<=n2;row++){
			for(int col=1;col<=row;col++){
				System.out.print(" ");
			}
			for(int r=1;r<=n-2*row;r++){
				if(r%2==0)
					System.out.print("*");
				else 
					System.out.print(" ");
			}
			System.out.println(); 
			
		
	}
	}
}

		

	


