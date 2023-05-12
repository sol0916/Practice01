package baekjoon;

import java.util.*;

public class ArraySwap {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		int n = scan.nextInt();
		int[] arr = new int[n];
		
		for(int i=0; i<n; i++) {
			arr[i] = i+1;
		}
		
		int m = scan.nextInt();
		
		for(int i=0; i<m; i++) {
			
			int a = scan.nextInt();
			int b = scan.nextInt();
			int temp = 0;
			
			temp = arr[a-1];
			arr[a-1] = arr[b-1];
			arr[b-1] = temp;
			
		}
		
		for(int i=0; i<arr.length; i++) {
			System.out.print(arr[i]+" ");
		}

	}

}
