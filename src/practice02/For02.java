package practice02;

import java.util.Scanner;

public class For02 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		System.out.print("정수 입력 >");
		int input = scan.nextInt();
		
		//별 출력하기 -1
		for(int i=1; i<=input; i++) {
			
			for(int j=1; j<=i; j++) {
			System.out.print("*");		
			}
			
			System.out.println();
		}
		
		System.out.println();
		
		//별 출력하기 -2 (오른쪽 정렬)
		for(int i=1; i<=input; i++) {
			
			for(int j=1; j<=input-i; j++) {
				System.out.print(" ");
			}
			for(int j=1; j<=i; j++) {
				System.out.print("*");
			}
			System.out.println();			
		}
		
		System.out.println();
		
		//별 출력하기 -3 (반전)
		for(int i=1; i<=input; i++) {
			
			for(int j=1; j<=i; j++) {
				System.out.print(" ");
			}
			for(int j=1; j<=input-i; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
		
		System.out.println();
		
		//별 출력하기 -4 (삼각형 모양)
		
		for(int i=1; i<=input; i++) {
			
			for(int j=1; j<=input-1; j++) {
				System.out.print(" ");
			}
			for(int j=1; j<=i*2-1; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
		
		
		//가운데가 빈 사각형
		
		System.out.print("가로 값 >");
		int num1 = scan.nextInt();
		System.out.println("세로 값 >");
		int num2 = scan.nextInt();
		
		for(int i=0; i<num2; i++) {
			
			for(int j=0; j<num1; j++) {
				
				if(j==0 || j==num1-1) {
					System.out.print("*");
				} else {
					System.out.print(i==0 || i==num2-1 ? "*" : " ");
				}
				
			}
				
			System.out.println();
		}

	}

}
