package baekjoon;

import java.util.Scanner;

public class Time2 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		int h = scan.nextInt();
		int m = scan.nextInt();
		
		int t = scan.nextInt();
		
		if((0<=h && h<=23) && (0<=m && m<=59)) {
			m += t;
			while(m>=60) {
				h++;
				m -= 60;						
				if(h>=24) {
					h = 0;
				}
			}
		}
		
		System.out.println(h+" "+m);

	}

}
