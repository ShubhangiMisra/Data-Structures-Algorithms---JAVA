package lecture2;

import java.util.Scanner;

public class minMaxOutOfN {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s= new Scanner(System.in);

		System.out.println("enter n");
		int n=s.nextInt();

		int min=Integer.MAX_VALUE;
		int max=Integer.MIN_VALUE;
		for (int i=1;i<=n;i+=1){

			System.out.println("enter "+i+" no.");
			int m=s.nextInt();
			//System.out.println(m);
			if (m<=min)
				min=m;

			if (m>=max)
				max=m;
			
			//System.out.println(max + " " +min);
		}
		System.out.println("max no. is"+max +"\n"+ " min. no. is"+min);




	}
}


