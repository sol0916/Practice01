package baekjoon;

import java.io.*;
import java.util.*;

public class AplusB8 {

	public static void main(String[] args) throws IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		StringTokenizer st;
		
		int count = Integer.parseInt(br.readLine());
		
		
		for(int i=1; i<=count; i++) {
			st = new StringTokenizer(br.readLine());
			int num1 = Integer.parseInt(st.nextToken());
			int num2 = Integer.parseInt(st.nextToken());
			bw.write("Case #"+i+": "+num1+" + "+num2+" = "+(num1+num2)+"\n");
		}
		
		bw.close();

	}

}
