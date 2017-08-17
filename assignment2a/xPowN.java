package assignment2a;

import java.util.Scanner;

public class xPowN {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s= new Scanner(System.in);
        System.out.println("enter no.");
        int x=s.nextInt();
        System.out.println("enter exponent");
        int n=s.nextInt();
        int p=1;
        for(int i=1;i<=n;i++){
        	  p=p*x;
        	  
        }System.out.println(x+" to the power of"+ n +"is"+ p);
	}

}
