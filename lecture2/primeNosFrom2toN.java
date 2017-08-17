package lecture2;
import java.util.Scanner;

public class primeNosFrom2toN {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       Scanner s= new Scanner(System.in);
       System.out.println("enter n");
       int n=s.nextInt();
       int i=2;
       while (i<=n){
    	      int div=2;
    	      while (div<i){
    	    	    if (i%div==0){
    	    	    	break;}
    	    	    else div++;
    	    	    
    	    	    }
    	      if (div==i) System.out.println(i);
    	      i++;
    	      
    	      }
       }
       
       
	}


