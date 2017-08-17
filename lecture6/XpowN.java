package lecture6;

import java.util.Scanner;

public class XpowN {
	
	public static int xPOWn(int x,int n){
		if (n==0)
			return 1;
		return x*xPOWn(x,n-1);
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
         Scanner s=new Scanner(System.in);
 		System.out.println("enter x");
 		int x=s.nextInt();
 		System.out.println("enter n");
 		int n=s.nextInt();
 		System.out.println(xPOWn(x,n));;
 		
	}

}
