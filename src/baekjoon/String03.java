package baekjoon;

import java.util.Scanner;

public class String03 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		int num = scan.nextInt();
		
		for(int i=1; i<=num; i++) {
			String str = scan.next();
			char c1 = str.charAt(0);
			char c2 = str.charAt(str.length()-1);
			System.out.println(String.valueOf(c1)+String.valueOf(c2));
		}
		
		scan.close();

	}

}
