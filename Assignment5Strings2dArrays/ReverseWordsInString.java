package Assignment5Strings2dArrays;

import java.util.Scanner;

public class ReverseWordsInString {

	public static void revWord(String str){
		int i=0;
		while(i<str.length()){
			while( i<str.length()&& str.charAt(i)==' '){
				System.out.print(" ");
				i++;
			}
			int wordStart=i;
			while(i<str.length()&&str.charAt(i)!=' '){
				i++;
			}
			for(int j=i-1;j>=wordStart;j--){
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
		revWord(str);
	}

}
