package baekjoon;

import java.io.*;
import java.util.*;

public class Array04FindMax {

	public static void main(String[] args) throws IOException {
		
//		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
//		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
//		int max = 0;
//		int count = 0;
//		
//		for(int i=0; i<9; i++) {
//			StringTokenizer st = new StringTokenizer(br.readLine());
//			int num = Integer.parseInt(st.nextToken());
//			
//			if(num>max) {
//				max = num;
//			}
//			
//		}
//		bw.write(max);
//		bw.write(count);
//		
//		bw.flush();
//		bw.close();
		
		
		Scanner scan = new Scanner(System.in);
		
		int[] arr = new int[9];
		int max = arr[0];
		int count = 0;
		
		for(int i=0; i<arr.length; i++) {
			int num = scan.nextInt();
			arr[i] += num;
			if(num>max) {
				max = num;
				count = i+1;
			}
		}
		
		System.out.println(max);
		System.out.println(count);
	}

}
