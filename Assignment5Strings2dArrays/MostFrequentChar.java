package Assignment5Strings2dArrays;

import java.util.Scanner;

public class MostFrequentChar {

	public static char freq(String str){
		int max=Integer.MIN_VALUE;
		int maxI=0;
		for (int i=0;i<=str.length()-2;i++){
			int count=1;
			for(int j=i+1;j<=str.length()-1;j++){
				if (str.charAt(i)==str.charAt(j))
					count+=1;
			}
			if (max<count){
				max=count;
				maxI=i;
			}	
		}
		return str.charAt(maxI);

	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner s=new Scanner(System.in);
		System.out.println("enter string");
		String str=s.next();
		System.out.println(freq(str));

	}

}
