package dynamic_programming;

public class EditDistance_DP {
	public static int edit(String s,String t){
		int m=s.length();
		int n=t.length();
		int [][]storage=new int[m+1][n+1];
		for(int i=0;i<=m;i++){
			storage[i][0]=i;
		}
		for(int j=0;j<=n;j++){
			storage[0][j]=j;
		}
		for(int i=1;i<=m;i++){
			for(int j=1;j<=n;j++){
				if(s.charAt(m-i)==t.charAt(n-j)){
					storage[i][j]=storage[i-1][j-1];
				}
				else{
					int insert=storage[i][j-1];
					int delete=storage[i-1][j];
					int replace=storage[i-1][j-1];
					storage[i][j]=1+Math.min(replace, Math.min(delete, insert));
				}
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
