package practice02;

import java.util.Scanner;

public class Quiz15Ex {

	public static void main(String[] args) {

		
		/*
		 * 1. 입력 받은 수까지의 소수들의 합
		 * 2. 적절한 시점에 초기화를 해야함
		 */
		
		Scanner scan = new Scanner(System.in);
		
		System.out.print("정수를 입력하세요 >");
		int num = scan.nextInt();
		
		int sum = 0;
		
		for(int i=1; i<=num; i++) {
			
			int count = 0;
			
			for(int j=1; j<=i; j++) {
				
				if(i%j==0) {
					count++;					
				}			
			}
			if(count==2) {
				sum += i; //i의 값이 소수인지 판별함
			}					
		} //end for
		
		System.out.println("소수의 합 : "+sum);

		scan.close();
		
	}

}
