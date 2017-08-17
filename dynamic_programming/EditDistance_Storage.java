package dynamic_programming;

public class EditDistance_Storage {
	
	public static int edit(String s,String t){
		int storage[][]=new int[s.length()+1][t.length()+1];
		for(int i=0;i<s.length()+1;i++){
			for(int j=0;j<t.length()+1;j++){
				storage[i][j]=-1;
			}
		}
		return editR(s,t,storage);
	}

	private static int editR(String s, String t, int[][] storage) {
		int m=s.length();
		int n=t.length();
		if(m==0||n==0){
			storage[m][n]=Math.max(m, n);
			return storage[m][n];
		}
		if(storage[m][n]!=-1){
			return storage[m][n];
		}
		else{
			if(s.charAt(0)==t.charAt(0)){
				storage[m][n]=editR(s.substring(1), t.substring(1), storage);
				return storage[m][n];
			}
			else{
				int insert=editR(s, t.substring(1), storage);
				int delete=editR(s.substring(1), t, storage);
				int replace=editR(s.substring(1), t.substring(1), storage);
				storage[m][n]=1+Math.min(Math.min(insert, delete), replace);
			}
		}
		return storage[m][n];
	}


	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s="abd";
		String t="bde";
		System.out.println(edit(s, t));

	}

	

}
