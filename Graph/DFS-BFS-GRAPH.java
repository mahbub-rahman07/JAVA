
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.Scanner;
class DFS_BFS {
	public static void main(String[] args) {		
		Graph myGraph = new Graph();
		
		int uNode,vNode,nodeNumber;
		int edge,source,destination;
		Scanner scanner = new Scanner(System.in);
		nodeNumber = scanner.nextInt();
		
		for(int i = 0; i <= nodeNumber ; i++ ){					
			myGraph.nodeLokeup.put(i, new Node(i));			
		}
		edge = scanner.nextInt();
		for(int i = 0; i < edge; i++){
			uNode = scanner.nextInt();
			vNode = scanner.nextInt();			
			myGraph.addEdge(uNode, vNode);			
		}
		source = scanner.nextInt();
		destination = scanner.nextInt();
		System.out.println(myGraph.hasPathDFS(source, destination));
		System.out.println(myGraph.hasPathBFS(source, destination));
		
	}

}
class Node{
		int id;
		LinkedList<Node> adjacent = new LinkedList<Node>();
		public Node(int id){
			this.id = id;
		}		
}
class Graph{
	public static HashMap<Integer,Node> nodeLokeup = new HashMap<Integer , Node >();
	// object class	
	
	public Node getNode(int id) {	
		Node node = nodeLokeup.get(id);		
		return node;
	}
	public boolean isContain(int id){
		try {
			if(nodeLokeup.get(id) != null){
				return true;
			}
			
		} catch (Exception e) {			
			return false;
		}		
		return false;
	}
	public void addEdge(int source,int destination) {
			Node sNode = getNode(source);
			Node dNode = getNode(destination);
			sNode.adjacent.add(dNode); // s-> d
	}	// DFS
	
	public boolean hasPathDFS(int source,int destination) {
		Node sNode = getNode(source);
		Node dNode = getNode(destination);
		HashSet<Integer> visited = new HashSet<Integer>(); //visited table 
		
		return hasPathDFS(sNode, dNode ,visited);
	}
	public boolean hasPathDFS(Node s,Node d,HashSet<Integer> visited) {
		if(visited.contains(s.id)){
			return false; // if already visited this node then no path
		}
		visited.add(s.id);
		if(s == d){
			return true;
		}
		
		for(Node child : s.adjacent){
			if(hasPathDFS(child, d , visited)){
				return true;
			}
		}
		
		return false;
		
	}
	// BFS
	public boolean hasPathBFS(int s,int d) {
		return hasPthBFS(getNode(s) ,getNode(d));
	}
	public boolean hasPthBFS(Node source ,Node dest) {
		LinkedList<Node> nextTovisit = new LinkedList<Node>();
		HashSet<Integer> visited = new HashSet<Integer>(); //visited table 
		nextTovisit.add(source);
		
		while (! nextTovisit.isEmpty()) {
			Node node = nextTovisit.removeFirst();
			if(node == dest){
				return true;
			}
			if(visited.contains(node.id)){
				continue;
			}
			visited.add(node.id);
			
			for(Node child : node.adjacent){
				nextTovisit.add(child);
			}
			
		}
		return false;
	}
	
	
}