package baekjoon;

import java.util.*;

public class Array08 {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		int[] arr = new int[10]; 

		int count = 10;

		for(int i=0; i<arr.length; i++) {
			int num = scan.nextInt();
			arr[i] = num%42;
		}


		for(int i=0; i<arr.length-1; i++) {
			for(int j=i+1; j<arr.length; j++) {
				if(arr[i]==arr[j]) {
					count--;
					break;
				}
			}
		}
		
		if(count==0) {
			count += 1;
		}

		System.out.println(count);

		scan.close();

	}

}
