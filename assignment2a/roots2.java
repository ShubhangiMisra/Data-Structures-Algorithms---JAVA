package assignment2a;

import java.util.Scanner;

public class roots2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// TODO Auto-generated method stub
		Scanner s= new Scanner(System.in);
		System.out.println("a");
		float a=s.nextInt();
		System.out.println("b");
		float b=s.nextInt();
		System.out.println("c");
		float c=s.nextInt();
		double d= Math.pow(b, 2)-4*a*c;
        double x1=(-b+Math.pow(d, 0.5))/2*a;
        double x2=(-b-Math.pow(d, 0.5))/2*a;
        System.out.println("roots are:"+x1+" "+x2);
	}}
