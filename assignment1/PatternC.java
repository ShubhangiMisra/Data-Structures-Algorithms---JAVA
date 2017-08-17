package assignment1;

public class PatternC {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n=5;
		for(int row=0;row<=n-1;row++){
				for (int col=1;col<=n-row-1;col++){
					System.out.print(" ");
				}
				for(int r=1;r<=2*row+1;r++){
					if(r%2!=0)
					System.out.print(n-row);
					else
						System.out.print(" ");
				}
				System.out.println();
		}
	}
}
		

	


