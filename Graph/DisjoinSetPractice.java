package graph;
import java.util.Scanner;

import graph.DisjoinSet;;
public class DisjoinSetPractice {
	static Scanner sc = new Scanner(System.in);
	public static void main(String[] args) {
		int n,m;
		n = sc.nextInt();
		m = sc.nextInt();
		DisjoinSet ds = new DisjoinSet();
		for(int i = 1; i <= n; i++){
			ds.makeSet(i);
		}
		for(int i = 1; i<= m; i++){
			int u,v;
			u = sc.nextInt();
			v = sc.nextInt();
			ds.union(u,v);
		}

	}

}
