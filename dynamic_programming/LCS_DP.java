package dynamic_programming;

public class LCS_DP {
	
	public static String lcs(String s,String t){
		int m=s.length();
		int n=t.length();
		String [][]storage=new String[m+1][n+1];
		for(int i=0;i<=m;i++){
			storage[i][0]="";
			
		}
		for(int j=0;j<=n;j++){
			storage[0][j]="";
		}
		for(int i=1;i<=m;i++){
			for(int j=1;j<=n;j++){
				if(s.charAt(m-i)==t.charAt(n-j)){
					storage[i][j]=s.charAt(m-i)+storage[i-1][j-1];
				}
				else{
					String option1=storage[i-1][j];
					String option2=storage[i][j-1];
					storage[i][j]=option1.length()>option2.length()?option1:option2;
				}
			}
		}
		return storage[m][n];
	}

	public static void main(String[] args) {
		
		String s="adcb";
		String t="acdb";
		System.out.println(lcs(s, t));

	}

}
