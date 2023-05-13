package baekjoon;

import java.util.*;

public class star2Re {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		System.out.print("별 개수 >");
		int count = scan.nextInt();
		
		for(int i=0; i<count; i++) {
			for(int j=0; j<count-i; j++) {
				System.out.print(" ");				
			}
			for(int k=0; k<i+1; k++) {
			System.out.print("*");
			}
			System.out.println();
		}
		
	}

}
