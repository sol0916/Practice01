package study;

import java.util.*;

public class BJ1260A {

	static boolean visited[];
	static ArrayList<Integer> A[];
	
	public static void main(String[] args) {
			
	Scanner scan = new Scanner(System.in);
	int N = scan.nextInt();
	int M = scan.nextInt();
	int start = scan.nextInt();
	
	A = new ArrayList[N+1];
	
	for(int i=1; i<=N; i++) {
		A[i] = new ArrayList<Integer>();
	}
	
	for(int i=1; i<M; i++) {
		int S = scan.nextInt();
		int E = scan.nextInt();
		A[S].add(E);
		A[E].add(S);
	}
	
	for(int i=1; i<N; i++) {
		Collections.sort(A[i]);
	}
	
	visited = new boolean[N+1];
	DFS(start);
	System.out.println();
	
	visited = new boolean[N+1];
	BFS(start);
	System.out.println();
		
	}
	
	private static void BFS(int Node) {
		Queue<Integer> queue = new LinkedList<Integer>();
		queue.add(Node);
		visited[Node] = true;
		
		while(!queue.isEmpty()) {
			int now_Node = queue.poll();
			System.out.print(now_Node+" ");
			for(int i : A[now_Node]) {
				if(!visited[i]) {
					visited[i] = true;
					queue.add(i);
				}
			}
		}
	}
	
	private static void DFS(int Node) {
		System.out.print(Node+" ");
		visited[Node] = true;
		for(int i : A[Node]) {
			if(!visited[i]) {
				DFS(i);
			}
		}
	}
}
