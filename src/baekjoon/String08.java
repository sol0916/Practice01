package baekjoon;

import java.io.*;
import java.util.Arrays;

public class String08 {

	public static void main(String[] args) throws IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

		String[] arrStr = br.readLine().trim().split(" ");

		if(Arrays.asList(arrStr).contains("")) {
			bw.write(Integer.toString(0));
		} else {
			bw.write(Integer.toString(arrStr.length));
		}

		bw.flush();
		bw.close();

	}

}
