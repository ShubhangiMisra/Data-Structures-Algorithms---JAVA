package lecture16_trees;

import stacksNqueues.QueueEmptyException;

public class sumOfDataOfTree {
	
	public static int sum(TreeNode<Integer> root){
		int sum=0;
		for(int i=0;i<root.children.size();i++){
			sum+=sum(root.children.get(i));
		}
		return sum+root.data;
	}

	public static void main(String[] args) throws QueueEmptyException {
		// TODO Auto-generated method stub
        TreeNode<Integer>root=TreeUse.takeInput();
        System.out.println(sum(root));
	}

}
