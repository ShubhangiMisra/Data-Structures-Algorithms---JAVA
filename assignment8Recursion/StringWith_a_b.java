package assignment8Recursion;

import java.util.Scanner;

public class StringWith_a_b {
	
	public static boolean check(String input,int index){
		if(index==input.length()){
			return false;
		}
		if((index==0) && input.charAt(index)!='a'){
			return false;
		}
		if(input.charAt(index)=='a'){
			if(input.charAt(index+1)=='a'){
				return check(input, index+2);
			}
			else{
				return check(input, index+1);
			}
		}
		
		if(input.charAt(index-1)=='a'&& input.charAt(index+1)!='b'){
			return false;	
		}
		if(input.charAt(index-1)=='b'&& input.charAt(index+1)!='a'){
			return false;
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s =new Scanner(System.in);
		System.out.println("enter string");
		String input=s.next();
		
		

	}

}
