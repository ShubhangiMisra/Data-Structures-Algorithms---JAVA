package assignment7recursion;

import java.util.Scanner;

public class ReverseString {
	
	public static String reverse(String input,int index){
		if (index==input.length()-1){
			return input.substring(index);
		}
		String strSmall=reverse(input,index+1);
		
			return strSmall +input.charAt(index);
		}
		
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s= new Scanner(System.in);
		System.out.println("enter string");
		String str=s.nextLine();
		System.out.println(reverse(str,0));

	}

}
