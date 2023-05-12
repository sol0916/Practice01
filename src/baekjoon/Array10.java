package baekjoon;

import java.util.*;

public class Array10 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		int num = scan.nextInt();
		int[] arr = new int[num];
		
		for(int i=0; i<arr.length; i++) {
			int score = scan.nextInt();
			arr[i] = score;
		}
		
		
		double max = arr[0];
		
		for(int i=1; i<arr.length; i++) {
			if(max<arr[i]) {
				max = arr[i];
			}
		}
		
		double sum = 0;
		
		for(int i=0; i<arr.length; i++) {
			sum += (arr[i]/max)*100;
		}
		
		double avg = sum/num;
		
		System.out.println(avg);

	}

}
