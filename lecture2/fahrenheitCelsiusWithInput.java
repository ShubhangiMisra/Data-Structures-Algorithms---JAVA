package lecture2;

import java.util.Scanner;

public class fahrenheitCelsiusWithInput {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
      Scanner s= new Scanner(System.in);
      System.out.println("enter min. fahrenheit value");
      int fahrenheitValue= s.nextInt();
      System.out.println("enter maxfahrenheit value");
      int maxFahrenheit=s.nextInt();
      System.out.println("enter step value");
      int stepValue=s.nextInt();
      
      while (fahrenheitValue<=maxFahrenheit){
    	    int celsius=(int)((5.0/9)*(fahrenheitValue-32));
    	    System.out.println(fahrenheitValue+" "+celsius);
    	    fahrenheitValue=fahrenheitValue+stepValue;
    	    
      }
      
	}

}
