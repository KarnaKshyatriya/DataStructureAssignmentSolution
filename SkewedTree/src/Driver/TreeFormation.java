package Driver;
import java.util.*;

public class TreeFormation {
	BST bst;

	Node root = null;
	public Node treeFormation()
	{
		Scanner sc = new Scanner(System.in);
		int value;

		bst=new BST();

		System.out.println("Enter the number of nodes for the BST");
		int size=sc.nextInt();
		int[] arr=new int[size];

		System.out.println("Enter the values for the BST");
		for (int i = 0; i < arr.length; i++)
		{
			arr[i]=sc.nextInt();
		}
		for (int i = 0; i < arr.length; i++)
		{
			value=arr[i];
			if (root == null)
			{
				root = bst.insert(root, value);
			}
			else 
			{
				bst.insert(root, value);
			}
		}


		sc.close();
		return root;
	}


}



