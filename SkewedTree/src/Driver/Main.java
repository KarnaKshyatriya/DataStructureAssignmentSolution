package Driver;

public class Main {
	BST bs;
	InorderTraversal iot;
	TreeFormation tf;
	Node root = null;
	Main()
	{
		tf=new TreeFormation();
		root=tf.treeFormation();
		iot=new InorderTraversal();
		iot.inOrder(root);
	}
	public static void main(String args[])
	{
		new Main();
	}

}
