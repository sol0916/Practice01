package baekjoon;

import java.util.Scanner;

public class If01 {
	
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		System.out.print("");
		int A = scan.nextInt();
		System.out.print("");
		int B = scan.nextInt();
		
		if(A>B) {
			System.out.println(">");
		} else if(A<B) {
			System.out.println("<");
		} else {
			System.out.println("==");
		}
		
	}

}
