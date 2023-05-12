package baekjoon;

import java.util.*;

public class GuGu {

	public static void main(String[] args) {
		
		
		Scanner scan = new Scanner(System.in);
		
		int N = scan.nextInt();
		int N2 = 1;
		
		while(N2<=9) {
			System.out.println(N+" * "+N2+" = "+(N*N2));
			N2++;
		}
		
		scan.close();

	}

}
