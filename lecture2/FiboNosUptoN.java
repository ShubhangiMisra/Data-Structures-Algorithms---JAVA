package lecture2;

import java.util.Scanner;

public class FiboNosUptoN {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        Scanner s= new Scanner(System.in);
        System.out.println("enter n");
        int N= s.nextInt();
        int f=0;
        int sec=1;
        while(f<=N){
        	System.out.println(f);
        	int th=f+sec;
        	f=sec;
        	sec=th;
        	  
        }
	}

}
