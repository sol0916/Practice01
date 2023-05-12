package baekjoon;

import java.util.Scanner;

public class Time {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		int h = scan.nextInt();
		int m = scan.nextInt();
		
		if((0<=h && h<=23) && (0<=m && m<=59)) {
			m -= 45;
			if(m<0) {
				m += 60;
				h -= 1;	
				if(h<0) {
					h += 24;
				}
			}
		}
		
		
		System.out.println(h+" "+m);
		
	}

}
