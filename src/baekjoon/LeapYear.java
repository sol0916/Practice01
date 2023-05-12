package baekjoon;

import java.util.Scanner;

public class LeapYear {

	public static void main(String[] args) {


		//연도가 주어졌을 때, 윤년이면 1, 아니면 0을 출력
		//윤년은 4의 배수이며 100의 배수가 아니거나 400의 배수

		Scanner scan =  new Scanner(System.in);

		int leapYear = scan.nextInt();

		if(leapYear%4==0 && (leapYear%100!=0 || leapYear%400==0)) {
			System.out.println(1);
		} else {
			System.out.println(0);
		}

	}

}
