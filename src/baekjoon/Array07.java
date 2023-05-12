package baekjoon;

import java.util.*;

public class Array07 {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		int[] arr = new int[30];
		for(int i=0; i<arr.length; i++) {
			arr[i] = i+1;
		}

		String str = "";

		for(int i=0; i<28; i++) {

			int num = scan.nextInt();

			if(num>=1&&num<=30) {
				for(int j=0; j<arr.length; j++) {
					if(arr[j] == num) {
						arr[j] = 0;
					}
				}
			}
		}

		for(int i=0; i<arr.length; i++) {
			if(arr[i]!=0) {
				str += arr[i] + " ";
			}
		}

		System.out.println(str);

	}

}
