package lecture10;

import java.util.Scanner;

public class xPowerN {
	
	public static int pow(int x,int n){
		if(n==1)
			return x;
		if(n%2==0){
			int r=pow(x,n/2);
			return r*r;	
		}
		else {
			int r=pow(x,n/2);
			return x*r*r;
			
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);
		System.out.println("enter x");
		int x=s.nextInt();
		System.out.println("enter n");
		int n=s.nextInt();
		System.out.println(pow(x,n));

	}

}
