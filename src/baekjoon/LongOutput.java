package baekjoon;

import java.util.Scanner;

public class LongOutput {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		int N = scan.nextInt();
		
		
		String str = "";
		String str2 = "";
		
		for(int i=1; i<=N; i++) {
			if(i%4==0) {
				str = "long ";
				str2 += str;
			}			
		}
		
		System.out.print(str2+"int");

		scan.close();
	}

}
