import java.util.*;
import javax.management.*;

class BreathFirsSearch {
	public static void main(String[] args) {
		BFS_Graph g = new BFS_Graph(6);
		
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
		
		g.bfsExplore(0);   
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

class BFS_Graph{
	int size;
	AdjList[] arr;
	
	public BFS_Graph(int sz){
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
	
	public void bfsExplore(int  start){
		Boolean[] visited = new Boolean[size];
		for(int i = 0; i < size ; i++){
			visited[i] = false;
		}
		Queue<Integer> q = new LinkedList<Integer>();
		q.add(start);
		
		while (!q.isEmpty()) {
			int n = q.poll();
			System.out.println("visited node: "+n);
			
			visited[n] = true;
			
			Node head = arr[n].head;	
			
			while (head != null) {
				if(!visited[head.value]){
					q.add(head.value);
					visited[head.value] = true;					
				}else{
					head = head.next;
				}
				
			}
			
		}
		
	}
	
}