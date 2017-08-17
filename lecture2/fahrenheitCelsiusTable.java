package lecture2;

public class fahrenheitCelsiusTable {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
    int fahrenheitValue=0;
    int maxFahrenheit=100;
    while (fahrenheitValue<=maxFahrenheit){
    	   int celsius=(int)((5.0/9)*(fahrenheitValue-32));
    	   System.out.println(fahrenheitValue+" "+celsius);
    	   fahrenheitValue=fahrenheitValue+20;
    
    	   
    	   
    }
	}

}
