package assignment7recursion;

import java.util.Scanner;

public class ParenthesisAndContents {
	
	public static String par(String str){
		if(str.charAt(0)=='('&& str.charAt(str.length()-1)==')'){
			return str;
		}
		if(str.charAt(0)=='('&& str.charAt(str.length()-1)!=')'){
			return par(str.substring(0,str.length()-1));
			
		}
		if(str.charAt(0)!='('&& str.charAt(str.length()-1)==')'){
			return par(str.substring(1,str.length()));
			
		}
		else{
			return par(str.substring(1,str.length()-1));
			
		}
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);
		System.out.println("enter string");
		String str=s.next();
		System.out.println(par(str));

	}

}
