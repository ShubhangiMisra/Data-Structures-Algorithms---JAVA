package dynamic_programming;

public class LCS_improved {
	
	public static String lcs(String s,String t){
		String storage[][]=new String [s.length()+1][t.length()+1];
		return lcsR(s,t,storage);
	}
	
	private static String lcsR(String s, String t, String[][] storage) {
		int m=s.length();
		int n=t.length();
		if(m==0||n==0){
			storage[m][n]="";
			return storage[m][n];
		}
		if(storage[m][n]!=null){
			return storage[m][n];
		}
		if(s.charAt(0)==t.charAt(0)){
			storage[m][n]= s.charAt(0)+lcsR(s.substring(1), t.substring(1), storage);
		}
		else{
			String option1=lcsR(s.substring(1), t, storage);
			String option2=lcsR(s, t.substring(1), storage);
			if(option1.length()>option2.length()){
				return option1;
			}
			else{
				return option2;
			}
		}
		return storage[m][n];
	}


	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s="adcb";
		String t="acdb";
		System.out.println(lcs(s, t));
		

	}

}
