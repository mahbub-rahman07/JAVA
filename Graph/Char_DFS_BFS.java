import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.Scanner;

class DFS_BFS {

	public static void main(String[] args) {		
		Graph myGraph = new Graph();
		/*
		 * 
		6
		6
		A B
		A C
		A D
		B E
		D E
		E F
		C F
		 * */
		char uNode,vNode,source,destination;
		int edge,nodeNumber;
		Scanner scanner = new Scanner(System.in);
		nodeNumber = scanner.nextInt();
		
		for(int i = 0; i <= nodeNumber ; i++ ){	
			int ch = 'A';
			char cc = (char) (ch+i);		
			myGraph.nodeLokeup.put(cc, myGraph.new Node(cc));			
		}
		edge = scanner.nextInt();
		for(int i = 0; i < edge; i++){
			uNode = scanner.next().charAt(0);
			vNode = scanner.next().charAt(0);			
			myGraph.addEdge(uNode, vNode);			
		}
		source = scanner.next().charAt(0);
		destination = scanner.next().charAt(0);
		System.out.println(myGraph.hasPathDFS(source, destination));
		System.out.println(myGraph.hasPathBFS(source, destination));
		
	}

	static class Graph{
		public static final HashMap<Character,Node> nodeLokeup = new HashMap<Character , Node >();
		// object class	
		class Node{
			char id;
			LinkedList<Node> adjacent = new LinkedList<Node>();
			public Node(char id){
				this.id = id;
			}		
		}
		public Node getNode(char id) {	
			Node node = nodeLokeup.get(id);		
			return node;
		}
		public boolean isContain(char id){
			try {
				if(nodeLokeup.get(id) != null){
					return true;
				}
				
			} catch (Exception e) {			
				return false;
			}		
			return false;
		}
		public void addEdge(char source,char destination) {
				Node sNode = getNode(source);
				Node dNode = getNode(destination);
				sNode.adjacent.add(dNode); // s-> d
		}	// DFS
		
		public boolean hasPathDFS(char source,char destination) {
			Node sNode = getNode(source);
			Node dNode = getNode(destination);
			HashSet<Character> visited = new HashSet<Character>(); //visited table 
			
			return hasPathDFS(sNode, dNode ,visited);
		}
		public boolean hasPathDFS(Node s,Node d,HashSet<Character> visited) {
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
		public boolean hasPathBFS(char s,char d) {
			return hasPthBFS(getNode(s) ,getNode(d));
		}
		public boolean hasPthBFS(Node source ,Node dest) {
			LinkedList<Node> nextTovisit = new LinkedList<Node>();
			HashSet<Character> visited = new HashSet<Character>(); //visited table 
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
}

