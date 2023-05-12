package baekjoon;

import java.util.Scanner;

public class Bill {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		long ep = scan.nextLong();
		int totalNum = scan.nextInt();
		
		int result = 0;
		
		for(int i=0; i<totalNum; i++) {
		int product = scan.nextInt();
		int count = scan.nextInt();
		
		result += (product*count);		
		}
		
		if(ep==result) {
			System.out.println("Yes");
		} else {
			System.out.println("No");
		}	

	}

}
