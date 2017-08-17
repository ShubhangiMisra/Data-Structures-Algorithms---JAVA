package assignment2a;

import java.util.Scanner;

public class totalSalary {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		;
		Scanner s= new Scanner(System.in);
		System.out.println("enter grade");
		String str=s.nextLine();
		char grade=str.charAt(0);
		System.out.println("enter basic");
		float basic=s.nextFloat();
		float hra=(float)(0.2*basic);
		float da=(float)(0.5*basic);
		int allow=0;
		if (grade=='A')
			 allow=1700;
		else if (grade=='B')
			 allow=1500;
		else if(grade=='C')
			 allow=1300;
		float pf=(float)(0.11*basic);
		float t_sal=basic+hra+da+allow-pf;
		System.out.println(t_sal);
}

	}


