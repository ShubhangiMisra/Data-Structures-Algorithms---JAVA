package Assignment5Strings2dArrays;

import java.util.Scanner;

public class ReverseStringWordWise {
	
	public static void revWordwise(String str){
		int i=str.length()-1;
		while(i>=0){
			while( i>=0 && str.charAt(i)==' '){
				System.out.print(" ");
				i--;
			}
			int wordEnd=i;
			while(i>=0 && str.charAt(i)!=' '){
				i--;
			}
			for(int j=i+1;j<=wordEnd;j++){
				System.out.print(str.charAt(j));
			}
		}	
	}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s= new Scanner(System.in);
		System.out.println("enter string");
		String str=s.nextLine();
		System.out.println(str.length());
		revWordwise(str);
	}



	}


