package practice02;

import java.util.Scanner;

public class For01 {

	public static void main(String[] args) {

		//1000까지 정수 중에서 4의 배수이면서, 8의 배수가 아닌 수의 count(개수)
		// 50~100까지의 합계 구하기
		//입력 받은 정수가 소수인지 For문으로 판별 (소수의 특징은 약수의 개수가 2개)
		//1. 7~100까지 정수 중에 7의 배수만 가로로 출력
		//2. 1~200까지 정수 중에 9의 배수의 개수를 출력
		//3. 50~100사이의 두 수의 합
		//4. A~Z까지 가로로 붙여서 출력, A=65, Z=90
		//5. 입력받은 정수까지 팩토리얼 (5팩토리얼 = 5 * 4 * 3 * 2 * 1)


		//1000까지 정수 중에서 4의 배수이면서, 8의 배수가 아닌 수의 count(개수)
		int count = 0;

		for(int i=0; i<=1000; i++) {
			if(i%4==0 && i%8!=0) {
				count++;
			}			
		}
		System.out.println("1000까지 정수 중에서 4의 배수이면서 8의 배수인 수: "+count+"개");


		// 50~100까지의 합계 구하기
		int sum = 0;

		for(int i=50; i<=100; i++) {
			sum += i;
		}
		System.out.println("50~100의 합: "+sum);


		//입력 받은 정수가 소수인지 For문으로 판별 (소수의 특징은 약수의 개수가 2개)
		Scanner scan = new Scanner(System.in);

		System.out.print("정수를 입력하세요 > ");
		int num = scan.nextInt();
		int count2 = 0;

		for(int i=1; i<=num; i++) {
			if(num%i==0) {
				count2++;
			}
		}
		System.out.println(count2==2 ? num+"은 소수입니다" : num+"은 소수가 아닙니다");


		//1. 7~100까지 정수 중에 7의 배수만 가로로 출력

		for(int i=7; i<=100; i+=7) {
			System.out.print(i+" ");
		}

		System.out.println();

		//2. 1~200까지 정수 중에 9의 배수의 개수를 출력

		int count3 = 0;
		for(int i=0; i<=200; i+=9) {			
			count3++;
		}
		System.out.println("1~200까지 9의 배수의 개수 : "+(count3-1)); //0이 포함되기 때문에

		//3. 50~100사이의 두 수의 합

		int sum2 = 0;
		for(int i=50; i<=100; i++) {
			sum2 += i;
		}
		System.out.println("50~100사이의 합 : "+sum2);


		//4. A~Z까지 가로로 붙여서 출력, A=65, Z=90

		for(char c='A'; c<='Z'; c++) {
			System.out.print(c+" ");
		}

		System.out.println();

		//5. 입력받은 정수까지 팩토리얼 값 (5팩토리얼 = 5 * 4 * 3 * 2 * 1)

		System.out.println("값을 입력하시오 > ");
		int num2 = scan.nextInt();
		int sum3 = 1; 

		for(int i=1; i<=num2; i++) {
			sum3 *= i;
		}
		System.out.println(sum3);



		//별출력하기
		/*
		 * *
		 * **
		 * ***
		 * ****
		 */
		
		System.out.print("값을 입력하세요 >");
		int num3 = scan.nextInt();
		
		for(int i=1; i<=num3; i++) {
			for(int j=1; j<=i; j++) {
				System.out.print("*");
			}
			System.out.println();
		}

		System.out.println();
	

		/*
		     *
		    ***
		   *****
		  *******
		 ********* 
		 */

		System.out.println("값을 입력하시오 >");
		int num4 = scan.nextInt();
		
		for(int i=1; i<=num4; i++) {
			
			for(int j=1; j<=num4-i; j++) {
				System.out.print(" ");
			}
			
			for(int j=1; j<=i*2-1; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
		
				

		/*
		 * 1. 가로, 세로길이를 입력을 받습니다
		 * 2. 가로, 세로길이 만큼 사각형을 출력합니다
		 * 3. 단, 윤곽만 나오면 됩니다
		 * 
		 * 힌트 : 1행, 마지막행, 1열 마지막열만 출력
		 */

		
		System.out.print("사각형의 가로를 입력하세요 >");
		int num5 = scan.nextInt();
		System.out.println("사각형의 세로를 입력하세요 >");
		int num6 = scan.nextInt();
		
		for(int i=1; i<=num6; i++) {

			for(int j=1; j<=num5; j++) {
				
				if(i==1||i==num6) {
					System.out.print("*");
				} else {
					System.out.print(j==1||j==num5 ? "*" : " ");
				}
			}
			System.out.println();	
		}

	}

}
