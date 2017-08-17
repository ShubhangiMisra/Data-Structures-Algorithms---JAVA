package assignment2b;

import java.util.Scanner;

public class SquareRoot {
	public static float sqrt(int n,int deci){
		int currentdeci=0;
		float sqrt=0;
		while(currentdeci<=deci){
			double add=Math.pow(10, -1*currentdeci);
			while(sqrt*sqrt<=n){
				sqrt+=add;	
			}
			sqrt-=add;
			currentdeci+=1;
			
		}
		return sqrt;
		
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s= new Scanner(System.in);
	     System.out.println("enter no. ");
	     int num= s.nextInt();
	     System.out.println("enter no. of decimal places");
	     int deci= s.nextInt();
	     System.out.println(sqrt(num,deci));

	}

}
