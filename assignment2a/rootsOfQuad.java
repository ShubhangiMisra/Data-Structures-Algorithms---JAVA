package assignment2a;

import java.util.Scanner;

public class rootsOfQuad {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s= new Scanner(System.in);
        System.out.println("enter a");
        int a=s.nextInt();
        System.out.println("enter b");
        int b=s.nextInt();
        System.out.println("enter c");
        int c=s.nextInt();
        
        double d= Math.pow(b, 2)-4*a*c;
        double x1=(-b+Math.pow(d, 0.5))/2*a;
        double x2=(-b-Math.pow(d, 0.5))/2*a;
        System.out.println("roots are:"+x1+" "+x2);
        
	}
}
