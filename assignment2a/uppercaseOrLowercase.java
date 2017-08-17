package assignment2a;

import java.util.Scanner;

public class uppercaseOrLowercase {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s= new Scanner(System.in);
		System.out.println("enter character");
		String str=s.nextLine();
		char a=str.charAt(0);
		if (((int)a<=90)&&((int)a>=65))
			System.out.println("upper case");
			else if (((int)a<=120)&&((int)a>=97))
				System.out.println("lower case");
				else System.out.println("invalid character");
	}}
