package baekjoon;

import java.util.*;

public class Array09 {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		String str = "";

		int n = scan.nextInt();		
		int[] arr = new int[n];
		for(int i=0; i<n; i++) {
			arr[i] = i+1;
		}

		int m = scan.nextInt();
		for(int i=0; i<m; i++) {

			int first = scan.nextInt()-1;
			int last = scan.nextInt()-1;

			int length = last - first;
			int temp = 0;

			if(length==1) {
				for(int j=first; j<first+1; j++) {
					temp = arr[j];
					arr[j] = arr[j+1];
					arr[j+1] = temp;
				}
			} else {
				for(int j=0; j<=length/2; j++) {
					temp = arr[first+j];
					arr[first+j] = arr[last-j];
					arr[last-j] = temp;				
				}
			}


		}

		for(int i=0; i<arr.length; i++) {
			if(i==arr.length-1) {
				str += arr[i];
			} else {
				str += arr[i] + " ";
			}
		}

		System.out.println(str);

		scan.close();

	}

}
