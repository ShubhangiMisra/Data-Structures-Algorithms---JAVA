package dynamic_programming;

public class MinEditDistance {
	
	public static int edit(String s,String t){
		if(s.length()==0||t.length()==0){
			return Math.max(s.length(), t.length());
		}
		if(s.charAt(0)==t.charAt(0)){
			return edit(s.substring(1), t.substring(1));
		}
		else{
			return 1+Math.min(Math.min(edit(s, t.substring(1)), edit(s.substring(1), t)),edit(s.substring(1), t.substring(1)));
		}
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s="abd";
		String t="bde";
		System.out.println(edit(s, t));

	}

}
