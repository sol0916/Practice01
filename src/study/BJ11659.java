package study;

import java.util.*;

public class BJ11659 {

	public static void main(String[] args) {
		
		
		Scanner scan = new Scanner(System.in);
		
		//배열 개수, 횟수 변수
		int num = scan.nextInt();
		int count = scan.nextInt();
		

		//배열 값
		int[] arrInt = new int[num];
		for(int i=0; i<num; i++) {
			int[] sum = new int[num+1];
			
			arrInt[i] = scan.nextInt();
			sum[i+1] += arrInt[i];

			int start = scan.nextInt()-1;
			int end = scan.nextInt()-1;
		
			
			if(start==0) {
				sum[end] = arrInt[0];
			} else {
				sum[end] = sum[end-1] + arrInt[end];
			}

			System.out.println(sum[end]);
		}
			
	}

}
