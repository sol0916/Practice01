package baekjoon;

import java.io.*;

public class String11 {

	public static void main(String[] args) throws IOException{
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		String str = "";
		int count = 0;
		
		while((str=br.readLine())!=null||count<100) {						
			bw.write(str+"\n");
			count++;
		}
		
				
		bw.flush();		
		bw.close();
	}

}
