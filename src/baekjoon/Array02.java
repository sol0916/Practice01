package baekjoon;

import java.util.Scanner;

public class Array02 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		int n = scan.nextInt();		
		int[] arr = new int[n];
		
		int target = scan.nextInt();
		String result = "";

		for(int i=0; i<n; i++) {
				
			arr[i] = scan.nextInt();
			
			if(target>arr[i]) {
				result += arr[i] + " ";				
			}			
		}
		
		System.out.print(result);
		
		scan.close();
	}

}
