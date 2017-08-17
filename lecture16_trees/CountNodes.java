package lecture16_trees;

import stacksNqueues.QueueEmptyException;

public class CountNodes {
	
	public static int count(TreeNode<Integer>root){
		int count=0;
		for(int i=0;i<root.children.size();i++){
			count+=count(root.children.get(i));
		}
		return count+1;
	}


	public static void main(String[] args) throws QueueEmptyException {
		// TODO Auto-generated method stub
        TreeNode<Integer>root=TreeUse.takeInput();
        System.out.println(count(root));
	}
}
