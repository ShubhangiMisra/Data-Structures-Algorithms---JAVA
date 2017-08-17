package assignment7recursion;

import java.util.Scanner;

public class NestingOfParenthesis {
	
	public static boolean NestingCheck(String str){
		if(str.length()==1 &&( str.charAt(0)=='('||str.charAt(0)==')')){
			return false;
		}
		if(str.length()==1 &&( str.charAt(0)!='('&& str.charAt(0)!=')')){
			return true;
		}
		if(str.length()==0){
			return true;
		}
		else if((str.charAt(0)=='('&& str.charAt(str.length()-1)==')')){
			return NestingCheck(str.substring(1,str.length()-1));
		}
		else if(str.charAt(0)=='('&& str.charAt(str.length()-1)!=')'){
			return NestingCheck(str.substring(0,str.length()-1));
			
		}
		else if(str.charAt(0)!='('&& str.charAt(str.length()-1)==')'){
			return NestingCheck(str.substring(1,str.length()));
			
		}
		else{
			return NestingCheck(str.substring(1,str.length()-1));
	}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s= new Scanner(System.in);
		System.out.println("enter string");
		String str=s.nextLine();
		
		System.out.println(NestingCheck(str));
	

	}

}
