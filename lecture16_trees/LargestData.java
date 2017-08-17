package lecture16_trees;

import stacksNqueues.QueueEmptyException;

public class LargestData {
	
	public static int largest(TreeNode<Integer>root){
		int largest=root.data;
		for(int i=0;i<root.children.size();i++){
			int large=largest(root.children.get(i));
			if(large>largest){
				largest=large;
			}
		}
		
		return largest;
	}

	public static void main(String[] args) throws QueueEmptyException {
		// TODO Auto-generated method stub
		 TreeNode<Integer>root=TreeUse.takeInput();
	        System.out.println(largest(root));

	}

}
