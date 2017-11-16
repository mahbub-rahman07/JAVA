import java.util.*;

class DepthFirsSearch {
	public static void main(String[] args) {
		DFS_Graph g = new DFS_Graph(6);
		
		g.add(0,2);
		g.add(0,1);
		g.add(1,4);
		g.add(1,3);
		g.add(1,0);
		g.add(3,1);
		g.add(4,1);
		g.add(2,5);
		g.add(2,0);
		g.add(5,2);
		
		g.dfsExplore(0);   
	}
}
class Node{
	int value;
	Node next;
	public Node(int v , Node n){
		value = v;
		next = n;
	}
}

class AdjList{
	Node head;
}

class DFS_Graph{
	int size;
	AdjList[] arr;
	
	public DFS_Graph(int sz){
		size = sz;
		arr = new AdjList[size];
		
		for(int i = 0; i < size ; i++){
			arr[i] = new AdjList();
			arr[i].head = null;
		}
	}
	
	public void add(int src , int dest){
		Node n = new Node(dest, null);
		n.next = arr[src].head;
		arr[src].head = n;
	}
	
	public void dfsExplore(int  start){
		Boolean[] visited = new Boolean[size];
		for(int i = 0; i < size ; i++){
			visited[i] = false;
		}
		Stack<Integer> st = new Stack<Integer>();
		st.push(start);
		
		while (!st.empty()) {
			int n = st.pop();
			st.push(n);
			visited[n] = true;
			
			Node head = arr[n].head;
			Boolean isDone = true;
			
			while (head != null) {
				if(!visited[head.value]){
					st.push(head.value);
					visited[head.value] = true;
					isDone = false;
					break;
				}else{
					head = head.next;
				}
				
			}
			if(isDone == true){
				int out = st.pop();
				System.out.println("visited node: "+out);
			}
		}
		
	}
	
}