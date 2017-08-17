package lecture14_linkedLists;

import java.util.Scanner;

public class XgpOf2 {
	
	public static void compute(int x){
		if(2*x>100){
			System.out.println(x);
			return;
		}
		System.out.println(x);
		compute(2*x);
		System.out.println(x);
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);
		System.out.println("enter x");
		int x=s.nextInt();
		compute(x);

	}

}
