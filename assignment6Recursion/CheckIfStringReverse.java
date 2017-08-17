package assignment6Recursion;

import java.util.Scanner;

public class CheckIfStringReverse {
	
	public static boolean checkReverse(String str,String str1){
		if(str1.length() != str.length()){
			return false;
		}
		if(str.length() == 0 && str1.length() == 0){
			return true;
		}
		
//		if ((str.length()==1)&&(str1.length()==1)){
//			if (str.charAt(str.length()/2)==str1.charAt(str.length()/2))
//				return true;
//			else return false;
//			
		if(str.charAt(0) !=str1.charAt(str.length()-1)){
			return false;
		}
		boolean ans=checkReverse(str.substring(1),str1.substring(0,str.length()-1));
//		if (ans==true){
//			if(str.charAt(0)==str1.charAt(str.length()-1)){
//				return true;
//			}
//			return false;
		return ans;
		}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);
		System.out.println("enter string");
		String str=s.next();
		System.out.println("enter string");
		String str1=s.next();
		System.out.println(checkReverse(str,str1));
	}
	}


