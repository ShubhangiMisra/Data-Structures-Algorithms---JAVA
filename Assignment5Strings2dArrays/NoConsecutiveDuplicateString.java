package Assignment5Strings2dArrays;

import java.util.Scanner;

public class NoConsecutiveDuplicateString {
	
	public static String noDuplicate(String str){
		int i=0;
		String stro="";
				
		while(i<=str.length()-2){
			if (str.charAt(i)==str.charAt(i+1))
				i++;
			else {
				stro+=str.charAt(i);
				i++;
			}
		}
			stro+=str.charAt(str.length()-1);
			return stro;
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner s=new Scanner(System.in);
		System.out.println("enter string");
		String str=s.next();
		System.out.println(noDuplicate(str));
		

	}

}
