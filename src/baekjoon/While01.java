package baekjoon;

import java.util.Scanner;

public class While01 {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		int T = scan.nextInt();

		int num = 1;

		while(num<=T) {

			int A = scan.nextInt();
			int B = scan.nextInt();						
			System.out.println("Case #"+num+": "+(A+B));

			num++;
		}

		scan.close();

	}

}
