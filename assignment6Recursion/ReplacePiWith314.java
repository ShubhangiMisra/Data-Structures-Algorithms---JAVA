 package assignment6Recursion;

import java.util.Scanner;

public class ReplacePiWith314 {

	public static String replacePiWithoutIndex(String str){
		
		if(str.length()==0)
			return "";
			if(str.length()==1){
				return str;
			}
			
					if(str.charAt(0)=='p'){
						if(str.charAt(1) == 'i'){

								return 3.14+ replacePiWithoutIndex(str.substring(2));
							}
							}
					return str.charAt(0)+replacePiWithoutIndex(str.substring(1));
		}

					
					
			
		
	
	public static String replacePi(String str,int index){
		if(index==str.length())
			return ""; 
		if(str.charAt(index)=='p'){
			if(index<=str.length()-2){

				if(str.charAt(index+1)=='i'){
					return 3.14+replacePi(str, index+2);
				}}

		}
		return str.charAt(index)+replacePi(str, index+1);
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 Scanner s=new Scanner(System.in);
	        System.out.println("enter string");
	        String str=s.next();
	        System.out.println(replacePiWithoutIndex(str));
	}

}
