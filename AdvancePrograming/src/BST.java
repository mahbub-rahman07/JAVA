
public class BST {
	
		int data;
		BST left = null;
		BST right = null;
		
	
	public static void main(String[] args) {
		BST root = null;
		
		root = Insert(root, 10);
		root = Insert(root, 22);
		root = Insert(root, 11);
		root = Insert(root, 55);
		root = Insert(root, 33);
		PreOrder(root);
		
	}
	public static  BST Insert(BST root,int data){
		if(root == null){
			root = getNode(data);
		}
		else if(data <= root.data){
			root.left = Insert(root.left, data);
		}
		else{
			root.right = Insert(root.right, data);
		}
		
		return root;
	}
	public static BST getNode(int data) {
		BST t = null;
		t.data = data;
		t.left = null;
		t.right = null;
		return t;
	}
	public static void PreOrder(BST root) {
		if(root != null){
			System.out.println(root.data);
			PreOrder(root.left);
			PreOrder(root.right);
		}
	}

}
