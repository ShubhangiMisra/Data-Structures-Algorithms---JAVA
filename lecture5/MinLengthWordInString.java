package lecture5;

import java.util.Scanner;

public class MinLengthWordInString {

	//public

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s= new Scanner(System.in);
		System.out.println("enter string");
		String str=s.nextLine();
		int i=0,end=0,start=0;
		int min=Integer.MAX_VALUE;
		//System.out.println(str.length());
		while( i<str.length()){
			//System.out.println("in loop");
			int count=0;
			
			while (i<str.length() && str.charAt(i)!=' '){
				//System.out.println("in loop");
				count++;
				i++;
			}   
			if (min>count){
				min=count;
				end=i-1;
			    start=end-count+1;}
			i++;
		}
		System.out.println(min);
		System.out.println(str.substring(start, end+1));







	}



}


