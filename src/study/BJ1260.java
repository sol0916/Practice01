package study;

import java.io.*;
import java.util.*;

public class BJ1260 {

	static boolean visited[];
	static ArrayList<Integer> A[];

	public static void main(String[] args) throws IOException {


		/* 
		 * DFS = 깊이 우선 탐색 (stack)
		 * BFS = 넓이 우선 탐색 (queue)
		 */
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		int node = Integer.parseInt(st.nextToken()); //정점의 개수
		int line = Integer.parseInt(st.nextToken()); //간선의 개수
		int start = Integer.parseInt(st.nextToken()); //시작 노드
		
		A = new ArrayList[node+1];
		
		for(int i=1; i<=node; i++) {
			A[i] = new ArrayList<Integer>();
		}
		
		StringTokenizer st2;
		for(int i=1; i<line; i++) {
			st2 = new StringTokenizer(br.readLine());
			int s = Integer.parseInt(st2.nextToken());
			int e = Integer.parseInt(st2.nextToken());
			A[s].add(e);
			A[e].add(s);
		}
		
		for(int i=1; i<node; i++) {
			Collections.sort(A[i]);
		}
		
		System.out.println();
		visited = new boolean[node+1];
		DFS(start);
		System.out.println();
		visited = new boolean[node+1];
		BFS(start);
		
		
	}
	
	//DFS
	private static void DFS(int start) {
		System.out.print(start+" ");
		visited[start] = true;
		for(int i : A[start]) {
			if(!visited[i]) {
				DFS(i);
			}
		}
	}
	
	//BFS
	private static void BFS(int start) {
		Queue<Integer> queue = new LinkedList<Integer>();
		queue.add(start);
		visited[start] = true;
		
		while(!queue.isEmpty()) {
			int now_node = queue.poll();
			System.out.print(now_node+" ");
			for(int i : A[now_node]) {
				if(!visited[i]) {
					visited[i] = true;
					queue.add(i);
				}
			}
		}
	}
}
