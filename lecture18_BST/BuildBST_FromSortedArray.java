package lecture18_BST;

import lecture17_.BinaryTreeNode;
import lecture17_.BinaryTreeUse;
import stacksNqueues.QueueEmptyException;

public class BuildBST_FromSortedArray {
	
	public static BinaryTreeNode<Integer> build(int input[],int start,int end){
		if(start>end){
			return null;
		}
		
		int mid=(start+end)/2;
		 BinaryTreeNode<Integer>root=new BinaryTreeNode<Integer>(input[mid]);
		 root.left=build(input,start,mid-1);
		 root.right=build(input, mid+1,end);
		 return root;
	}

	public static void main(String[] args) throws QueueEmptyException {
		// TODO Auto-generated method stub
		int input[]={1,2,3,4,5,6,7,12,16};
		BinaryTreeUse.printI(build(input,0,input.length-1));

	}

}
