package assignment7recursion;

import java.util.Scanner;

public class ReplaceChar {
	
	public static String replace(String str,char ch1,char ch2){
		if(str.length()==0){
			return "";
		}
		String strSmall=replace(str.substring(1),ch1,ch2);
		if (str.charAt(0)==ch1)
				return ch2+strSmall;
		else 
			return str.charAt(0)+strSmall;
		
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);
		System.out.println("enter string");
		String str=s.next();
		System.out.println("enter char1");
		char ch1=s.next().charAt(0);
		System.out.println("enter char2");
		char ch2=s.next().charAt(0);
		
		
		System.out.println(replace(str,ch1,ch2));

	}


	}


