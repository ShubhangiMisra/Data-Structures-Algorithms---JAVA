package dynamic_programming;

public class LargestCommonSubsequence {
	
	public static String lcs(String s,String t){
		if(s.length()==0 || t.length()==0){
			return "";
		}
		if(s.charAt(0)==t.charAt(0)){
			return s.charAt(0)+lcs(s.substring(1), t.substring(1));
		}
		else{
			String option1=lcs(s, t.substring(1));
			String option2=lcs(s.substring(1), t);
			if(option1.length()<option2.length()){
				return option2;
			}
			else{
				return option1;
			}
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s="adcb";
		String t="acdb";
		System.out.println(lcs(s, t));

	}

}
