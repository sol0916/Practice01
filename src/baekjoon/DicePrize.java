package baekjoon;

import java.util.Scanner;

public class DicePrize {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		int num1 = scan.nextInt();
		int num2 = scan.nextInt();
		int num3 = scan.nextInt();
			
		if((0<num1&&0<num2&&0<num3) && (num1<=6&&num2<=6&&num3<=6)) {
			int same = 0;
			if(num1==num2&&num2==num3) {
				same = num1;
				System.out.println(10000+same*1000);
			} else if(num1==num2||num2==num3||num1==num3) {
				if(num1==num2) {
					same = num1;
				} else if(num2==num3) {
					same = num2;
				} else {
					same = num3;
				}
				System.out.println(1000+same*100);
			} else if(num1!=num2&&num2!=num3) {
				int max = 0;
				if(num1>num2&&num1>num3) {
					max = num1;
				} else if(num2>num1&&num2>num3) {
					max = num2;
				} else {
					max = num3;
				}
				System.out.println(max*100);
			}
			
		}

	}

}
