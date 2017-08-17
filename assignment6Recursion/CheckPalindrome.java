package assignment6Recursion;

import java.util.Scanner;

public class CheckPalindrome {

	public static boolean check(String str,int index){

		if (index==str.length()/2+1){
			return true;}
		boolean ans=check(str,index+1);
		if (ans==true){
			if (str.charAt(index)==str.charAt(str.length()-1-index))
				return true;
			else
				return false;}
		else return false;



	}



	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);
		System.out.println("enter string");
		String str=s.next();
		System.out.println(check(str,0));
	}

}
