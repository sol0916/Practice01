package study;

import java.util.*;

public class BJ2018 {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		int num = scan.nextInt();
		int count = 1; 
		int start= 1;
		int end = 1;
		int sum = 1; 

		while(num!=end) {

			if(sum<num){
				end++;
				sum += end;
			} else if(sum>num){
				sum -= start;
				start++;
			} else{
				count++;
				end++;
				sum += end;
			}
		}

		System.out.println(count);


	}
}
