package lecture16_trees;

import stacksNqueues.QueueEmptyException;

public class HeightOfTree {
	
	public static int height(TreeNode<Integer>root){
		if(root.children.size()==0){
			return 1;
		}
		int maxSmallHeight=Integer.MIN_VALUE;
		for(int i=0;i<root.children.size();i++){
			int heightSmall=height(root.children.get(i));
			if(heightSmall>maxSmallHeight){
				maxSmallHeight=heightSmall;
			}
		}
		return maxSmallHeight+1;
		
	}

	public static void main(String[] args) throws QueueEmptyException {
		// TODO Auto-generated method stub
		 TreeNode<Integer>root=TreeUse.takeInput();
	        System.out.println(height(root));

	}

}
