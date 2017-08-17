package assignment6Recursion;

import java.util.Scanner;

public class StringToNum {
	
	public static int stringToNum(String str){
		if (str.length()==1)
			return str.charAt(0)-'0';
		return (stringToNum(str.substring(0,str.length()-1)))*10+str.charAt(str.length()-1)-'0';
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);
		System.out.println("enter string");
		String str=s.next();
		System.out.println(stringToNum(str));
	}

}
