package assignment7recursion;

import java.util.Scanner;

public class RemoveConsecutiveDuplicates {
	
	public static String dup(String str){
		if(str.length()==1)
			return str;
		String strSmall=dup(str.substring(1));
		if(str.charAt(0)==strSmall.charAt(0))
			return strSmall;
		else
			return str.charAt(0)+strSmall;
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);
		System.out.println("enter string");
		String str=s.next();
		System.out.println(dup(str));

	}

}
