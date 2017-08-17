package lecture5;

import java.util.Scanner;

public class ReverseString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s= new Scanner(System.in);
		System.out.println("enter string");
		String str=s.nextLine();
		
		String reverse="";
		for (int i=0;i<=str.length()-1;i++){
			reverse=str.charAt(i)+reverse;
			
		    
			
			
		}System.out.println(reverse);
	}

}
