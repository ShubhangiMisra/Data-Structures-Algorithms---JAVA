package Assignment5Strings2dArrays;

import java.util.Scanner;

public class LargestSubstringNoRepetition {

	public static String noRepetition(String input){
		int maxStart=0;
		int maxEnd=0;
		int currentStart=0;
		int i=0;
		boolean ans=false;
		while(currentStart<input.length()){
			for( i=currentStart+1;i<input.length();i++){
				for(int j=currentStart;j<i;j++){
					if(input.charAt(i)==input.charAt(j)){
						currentStart=j+1;
						ans=true;
						break;
					}	
				}
				if(ans==true){
					break;
				}
			}
			int maxLength=maxEnd-maxStart+1;
			int currentLength=i-currentStart;
			if(currentLength>maxLength){
				maxStart=currentStart;
				maxEnd=i-1;
			}
		}
		return input.substring(maxStart,maxEnd+1);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s= new Scanner(System.in);
		System.out.println("enter string");
		String str=s.nextLine();

		System.out.println(noRepetition(str));


	}

}
