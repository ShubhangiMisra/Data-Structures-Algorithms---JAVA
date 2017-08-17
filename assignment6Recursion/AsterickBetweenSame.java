package assignment6Recursion;

import java.util.Scanner;

public class AsterickBetweenSame {

	public static String asterick(String str){
		if(str.length()==1){
			return str;	
		}
		String strSmall=asterick(str.substring(1));
		if(str.charAt(0)==strSmall.charAt(0)){
			return str.charAt(0)+"*"+strSmall;

		}
		else {
			return str.charAt(0)+strSmall;
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);
		System.out.println("enter string");
		String str=s.next();
		System.out.println(asterick(str));

	}

}
