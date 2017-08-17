package lecture4;

import java.util.Scanner;

public class checkStringPalindrome {
	public static String takeInput(){
		System.out.println("enter string");
		Scanner s= new Scanner(System.in);
		String str=s.next();
		return str;
	}
	
	public static void checkPalindrome(String str ){
		int j=str.length()-1;
		for (int i=0;i<=str.length()/2;i++){
				if (str.charAt(i)==str.charAt(j)){
					j--;}
				else {
					System.out.println("not a palindrome");
				   return;}
		}
		System.out.println("palindrome");
				
	}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       String str=takeInput();
       checkPalindrome(str);
	}

}
