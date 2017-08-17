package lecture6;

import java.util.Scanner;

public class NumIntoWords {
	public static String numberToString(int n){

		if (n==0){
			return "zero";
			
		}
		if (n==1){
			
			return "one";
		}
		if (n==2){
			
			return "two";
		}
		if (n==3){
			
			return "three";
		}
		if (n==4){
			
			return "four";
		}if (n==5){
			
			return "five";
			
		}if (n==6){
			
			return "six";
		}if (n==7){
			
			return "seven";
		}if (n==8){
			
			return "eight";
		}if (n==9){
			
			return "nine";
		}else{
			return "";
		}
	}
	public static void numIntoWords1(int n){
		if(n==0){
			return;
		}
		int currentDigit =n%10;
		numIntoWords1(n/10);	
		System.out.println(numberToString(currentDigit));
	}

	
	public static void numIntoWords(int n){
		
		
		int q=n;
		int count=-1;
		while(q!=0){
			q/=10;
			count+=1;
			
					
		}
		System.out.println(n/Math.pow(10, count));
		numIntoWords(n%((int)Math.pow(10, count)));		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s= new Scanner(System.in);
		System.out.println("enter num");
		int n=s.nextInt();
		numIntoWords1(n);
	}

}
