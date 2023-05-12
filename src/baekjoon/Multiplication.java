package baekjoon;

import java.util.Scanner;

public class Multiplication {
	
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		long A = scan.nextLong();
		long B = scan.nextLong();
		
		long b1 = B%10; //일의 자리 값
		long b2 = (B%100)/10; //십의 자리 값
		long b3 = B/100; //백의 자리 값
		
		System.out.println(b1*A);
		System.out.println(b2*A);
		System.out.println(b3*A);
		System.out.println(A*B);
		
		scan.close();
		
	}

}
