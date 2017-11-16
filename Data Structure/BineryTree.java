class BineryTree {
	// add O(n)
	// search O(n)
	// delete O(1) + balance tree O(n)
	
	public static void main(String[] args) {
		BST bst = new BST();
		bst.addNode(10);
		bst.addNode(12);
		bst.addNode(11);
		bst.addNode(13);
		bst.addNode(6);		
		
		bst.Search(11);
		bst.displayPreOdred(bst.root);
		System.out.println();
		bst.displayInOdred(bst.root);
		System.out.println();
		bst.displayPostOdred(bst.root);
		
		
	}
}

class Node{
	int data;
	Node left;
	Node right;
	public Node(int data,Node l,Node r){
		this.data = data;		
		left = l;
		right = r;
	}
	public Node(int data){
		this.data = data;		
		left = null;
		right = null;
	}
}

class BST{

	Node root;
		
	public BST(){
		root = null;
	}
	public Node CreateNode(int data){
		return new Node(data);
	}
	public void addNode(int data){
		
		addNode(root, CreateNode(data));
	}
	
	public void addNode(Node start,Node newNode){
		//addNode(data, root);
		if(root == null){
			root = newNode;
			return;
		}
		if(start.data >= newNode.data){
			if(start.left == null){
				start.left = newNode;
			}else
				addNode(start.left, newNode);
		}
		if(start.data < newNode.data ){
			if(start.right == null){
				start.right = newNode;
			}else
				addNode(start.right, newNode);
		}
		
	}
	public void Search(int data){
		Search(data,root);
	}
	public void Search(int data ,Node start){
		if(start == null){
			System.out.println("Node not found");
			return;
		}
		
		if(start.data == data){
			System.out.println("node found");
			return;
		}	
		if(start.data < data){
			Search(data, start.right);
		}
		else if(start.data > data){
			Search(data, start.left);
		}			
	}
	
	
	
	public void displayPreOdred(Node start){
		if(start == null) return;
		
		System.out.print(start.data+"\t");
		displayPreOdred(start.left);
		displayPreOdred(start.right);
		
		
	}
	public void displayPostOdred(Node start){
		if(start == null) return;
		
		displayPostOdred(start.left);
		displayPostOdred(start.right);
		System.out.print(start.data+"\t");
		
	}
	public void displayInOdred(Node start){
		if(start == null) return;
		
		displayInOdred(start.left);
		System.out.print(start.data+"\t");
		displayInOdred(start.right);		
		
	}
	
	
}