package lecture17_;

import stacksNqueues.QueueEmptyException;

public class MirrorBinaryTree {
	
	public static void mirror(BinaryTreeNode<Integer>root){
		if(root==null){
			return ;
		}
		BinaryTreeNode<Integer>temp=root.left;
		root.left=root.right;
		root.right=temp;
		mirror(root.left);
		mirror(root.right);
	}

	public static void main(String[] args) throws QueueEmptyException {
		// TODO Auto-generated method stub
		BinaryTreeNode<Integer>root=BinaryTreeUse.takeInput();
		mirror(root);
		BinaryTreeUse.printI(root);

	}

}
