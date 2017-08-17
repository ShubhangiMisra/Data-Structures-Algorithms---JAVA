package final_lecture;

import java.util.Scanner;

public class NumberOfBalancedBST_HeightH {
	public static int num(int h){
		if(h==0){
			return 1;
		}
		if(h==1){
			return 1;
		}
		int h1=num(h-1);
		int h2=num(h-2);
		long temp1=h1*h1;
		long temp2=h1*h2;
		
		return ans%1000000007;
	}

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.println("enter height");
		int h=s.nextInt();
		System.out.println(num(h));

	}

}
