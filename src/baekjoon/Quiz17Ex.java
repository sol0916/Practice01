package baekjoon;

import java.util.Scanner;

public class Quiz17Ex {

	public static void main(String[] args) {
		
		// n + or - + n2 = ?
		//[문제를 그만 푸시려면 0을 입력하세요]
		//>
		
		//정답입니다
		//오답입니다
		
		//0 입력시 > 프로그램 정상 종료
		//정답 : n
		//오탑 : n
		
		
		Scanner scan = new Scanner(System.in);
		
		int countR = 0; //정답 개수
		int countW = 0; //오답 개수
		
		while(true) {
		
		int num1 = (int)(Math.random()*10)+1; //랜덤 값 1
		int num2 = (int)(Math.random()*10)+1; //랜덤 값 2
		int oper = (int)(Math.random()*2);   //연산 값
		
		
		System.out.println(num1+(oper==0 ? "+" : "-")+num2+" = ?");
		System.out.println("[문제를 그만 푸시려면 0을 입력하세요]");
		System.out.print(">");
		int answer = scan.nextInt();
		
		int correct = oper == 0 ? num1+num2 : num1-num2;
		
		if(correct==answer) {
			System.out.println("정답입니다");
			countR++;
		} else if(answer==0) {
			System.out.println("프로그램 정상 종료");
			System.out.println("정답 : "+countR);
			System.out.println("오답 : "+countW);
			break;
		} else {
			System.out.println("오답입니다");
			countW++;
		}
		
		
		}
		
		scan.close();

	}

}
