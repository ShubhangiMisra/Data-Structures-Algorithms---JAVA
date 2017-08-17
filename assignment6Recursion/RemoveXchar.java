package assignment6Recursion;

import java.util.Scanner;

public class RemoveXchar {

	public static String removeX(String str){
		if(str.length()==1){
			if (str.charAt(0)=='x'){
				return "";}
			else return str;
		}

		if (str.charAt(0)=='x'){
			return ""+removeX(str.substring(1));


		}
		return str.charAt(0)+removeX(str.substring(1));
	}




	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);
		System.out.println("enter string");
		String str=s.next();
		System.out.println(removeX(str));
	}

}
