package trees;

import java.util.LinkedList;
import java.util.Queue;


public class BinaryTreeNode {

	private int data;
	private BinaryTreeNode left;
	private BinaryTreeNode right;
	public int getData() {
		return data;
	}
	public void setData(int data) {
		this.data = data;
	}
	public BinaryTreeNode getLeft() {
		return left;
	}
	public void setLeft(BinaryTreeNode left) {
		this.left = left;
	}
	public BinaryTreeNode getRight() {
		return right;
	}
	public void setRight(BinaryTreeNode right) {
		this.right = right;
	}
	
	
	void levelOrderTraversal(BinaryTreeNode root)
	{
		BinaryTreeNode temp=null;
		Queue<BinaryTreeNode> q= new LinkedList<BinaryTreeNode>();
		if(root==null)
			return;
		q.add(root);
		while(!q.isEmpty())
		{
			temp=(BinaryTreeNode) q.poll();
			System.out.println(temp.getData());
			if(temp.getLeft()!= null)
				q.add(temp.getLeft());
			if(temp.getRight()==null)
				q.add(temp.getRight());
		}
		
	}
	
	void PreOrder(BinaryTreeNode root)
	{
		if(root!= null)
		{
			System.out.println(root.getData());
			PreOrder(root.getLeft());
			PreOrder(root.getRight());
		}
	}

	void PostOrder(BinaryTreeNode root)
	{
		if(root!=null)
		{
			PostOrder(root.getLeft());
			PostOrder(root.getRight());
			System.out.println(root.getData());
		}
	}


	void inOrder(BinaryTreeNode root)
	{
		if(root!=null)
		{
			inOrder(root.getLeft());
			System.out.println(root.getData());
			inOrder(root.getRight());
			
		}
	}
}
