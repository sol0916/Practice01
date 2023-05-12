package baekjoon;

import java.util.Scanner;

public class Count {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		int N = scan.nextInt();		
		int[] arr = new int[N];
				
		for(int i=0; i<arr.length; i++) {
			arr[i] = scan.nextInt();
		}
		
		int V = scan.nextInt();
		
		int count = 0;
		
		for(int i=0; i<arr.length; i++) {
			
			if(arr[i]==V) {
				count++;
			}
		}
		
		System.out.println(count);
		
		scan.close();

	}

}
