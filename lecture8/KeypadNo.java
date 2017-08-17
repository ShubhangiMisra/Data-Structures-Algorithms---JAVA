package lecture8;

public class KeypadNo {

	public static String stringForNum(int n){
		if(n==2)
			return "abc";
		if(n==3)
			return "def";
		if(n==4)
			return "ghi";
		if(n==5)
			return "jkl";
		if(n==6)
			return "mno";
		if(n==7)
			return "pqrs";
		if(n==8)
			return "tuv";
		if(n==9)
			return "wxyz";
		else return "";
	}

	public static  String[] combination(int n){
		if (n==0){
			String output[]={""};
			return output;
		}
		String[]smallOutput=combination(n/10);
		int r=n%10;
		String str=stringForNum(r);
		String output[]=new String[str.length()*smallOutput.length];
		int k=0;
		for (int i=0;i<smallOutput.length;i++){
			for (int j=0;j<str.length();j++){
				output[k]=smallOutput[i]+str.charAt(j);
				k++;
			}
		}
		return output;
		//				}
		//		if (r==2||r==3)||r==4||r==5)||r==6||r==8)||r==7){
		//			String output[]=new String[str.length()*smallOutput.length];
		//			for (int k=0;k<str.length()*smallOutput.length;k++){
		//			for (int i=0;i<smallOutput.length;i++){
		//				for (int j=0;j<str.length();j++){
		//					output[i]=smallOutput[i]+str.charAt(j);
		//		}

	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		



	}

}
