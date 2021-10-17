package Driver;

public class InorderTraversal {
	public void inOrder(Node root)
	{
		if (root == null)
			return;
		else 
		{
			inOrder(root.left);
			System.out.print(root.key + " ");
			inOrder(root.right);
		}
	}

}
