package baekjoon;

import java.io.*;
import java.util.*;

public class String07 {

	public static void main(String[] args) throws IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		StringTokenizer st;

		int count = Integer.parseInt(br.readLine());

		for(int i=0; i<count; i++) {
			st = new StringTokenizer(br.readLine());
			int num = Integer.parseInt(st.nextToken());
			char[] arrChar = st.nextToken().toCharArray();
						
			//중첩 for문 대신 string.repeat(n) 사용 가능 
			for(int j=0; j<arrChar.length; j++) {
				for(int k=0; k<num; k++) {
					bw.write(arrChar[j]);
				}
			}
				bw.write("\n");
		}


		bw.flush();
		bw.close();

	}

}
