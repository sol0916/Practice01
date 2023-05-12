package baekjoon;

import java.util.Scanner;

public class String01 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		String str = scan.next();
		int num = scan.nextInt();
		
		char result = str.charAt(num-1);
		System.out.println(result);
		
		scan.close();
		
	}

}
