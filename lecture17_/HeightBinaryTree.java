package lecture17_;

import stacksNqueues.QueueEmptyException;

public class HeightBinaryTree {
	
	public static int height(BinaryTreeNode<Integer>root){
		if(root==null){
			return 0;
		}
		int heightMax;
		int heightLeft=height(root.left);
		int heightRight=height(root.right);
		if(heightLeft>heightRight)
			heightMax=heightLeft;
		else
			heightMax=heightRight;
		return heightMax+1;
	}

	public static void main(String[] args) throws QueueEmptyException {
		// TODO Auto-generated method stub
		BinaryTreeNode<Integer>root=BinaryTreeUse.takeInput();
		System.out.println(height(root));

	}

}
