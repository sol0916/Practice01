package baekjoon;

import java.util.*;

public class Array05Put {

	public static void main(String[] args) {
		
		
		Scanner scan = new Scanner(System.in);
		
		int n = scan.nextInt();
		int[] arr = new int[n];
		
		String str = "";
		int m = scan.nextInt();
		
		for(int i=0; i<m; i++) {
					
			int first = scan.nextInt();
			int last = scan.nextInt();
			int put = scan.nextInt();
			
			
			for(int j=first; j<=last; j++) {				
				arr[j-1] = put;
				
			}			
		}
		
		for(int i=0; i<n; i++) {
		str += arr[i] + " ";
		}
		System.out.println(str);				

	}

}
