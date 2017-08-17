package dynamic_programming;

public class LCS_2_Strings {
	
	public static int lcs(String s,String t){
		if(s.length()==0 ||t.length()==0){
			return 0;
		}
		if(s.charAt(0)==t.charAt(0)){
			return 1+lcs(s.substring(1),t.substring(1));
		}
		else{
			return Math.max(lcs(s.substring(1), t), lcs(s, t.substring(1)));
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s="adcb";
		String t="acdb";
		System.out.println(lcs(s, t));

	}

}
