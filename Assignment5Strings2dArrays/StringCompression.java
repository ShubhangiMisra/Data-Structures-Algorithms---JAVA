package Assignment5Strings2dArrays;

import java.util.Scanner;

public class StringCompression {

	public static void compress(String str){
		int i=0;
		while(i<str.length()){
			int count=1;
			while((i<str.length()-1) && str.charAt(i)==str.charAt(i+1)){
				count++;	
				i++;
			}
			if(count>1)
				System.out.print(str.charAt(i)+""+count);
			else 
				System.out.print(str.charAt(i));
			i++;
		}
	}


	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s= new Scanner(System.in);
		System.out.println("enter string");
		String str=s.nextLine();

		compress(str);
	}



}
