class LinkedList_implementation {
	public static void main(String[] args) {
		LinkedListU<String> ls = new LinkedListU<String>();
		ls.addNode("hi");
		ls.addNode("To");
		ls.addNode("GO");
		ls.display();
		ls.deleteNodeFirst();
		ls.addNode("wow");
		ls.display();
		ls.removeValue("wo");
		ls.display();
		
		
	}
}

class Node{
	Object data;
	Node next;
	Node prev;
	public Node(Object d,Node p,Node n){
		data = d;
		next = n;
		prev = p;
	}
}

class LinkedListU<T>{
	Node root;
	public LinkedListU(){
		root = null;
		
	}
	public void addNode(Object d){
		Node newNode = new Node(d, null,null);
		
		if(root == null)
			root = newNode;
		else{
			newNode.next = root;
			newNode.prev = newNode;
			root = newNode;
		}
		
	}
	public void deleteNodeFirst(){
		root = root.next;
		//root.prev = null;
	}
	
	public void removeValue(T data){
		Node n = root;
		Node lastNode = root;

		while (n != null && n.data != data) {			
			lastNode = n;
			n = n.next;			
		}
		
		if(n != null){		
			if(lastNode == n){				
				root = lastNode.next;
			}else{
				lastNode.next = n.next;
			}
				
		}else{
			System.out.println("Not found");
		}
		
	}
	public void display(){
		Node n = root;
		System.out.println("All node are: ");
		while (n != null) {
			System.out.println((T)n.data);
			n = n.next;
		}
	}
	
}