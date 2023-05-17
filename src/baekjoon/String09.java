package baekjoon;

import java.io.*;
import java.util.*;

public class String09 {

	public static void main(String[] args) throws IOException{
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		//StringTokenizer st = new StringTokenizer(br.readLine());
		String[] arrStr = br.readLine().split(" ");
		
		char[] arr = arrStr[0].toCharArray();
		char[] arr2 = arrStr[1].toCharArray();
		
		char temp = arr[0];
		arr[0] = arr[2];
		arr[2] = temp;
		
		System.out.println(Arrays.toString(arr));
		
		String[] result = new String[2];
		for(int i=0; i<arr.length; i++) {
		}
		
		//값 뒤집기 - StringBuilder의 reverse() 사용 가능
		
		
		
		

	}

	private static char toCharArray(String nextToken) {
		// TODO Auto-generated method stub
		return 0;
	}

}
