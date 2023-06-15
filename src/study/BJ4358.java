package study;

import java.io.*;
import java.util.*;

public class BJ4358 {

	public static void main(String[] args) throws IOException  {		

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));		
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));	

		HashMap<String, Integer> tree_map = new HashMap<String, Integer>(); // 나무 종의 이름, 해당 나무의 수		

		String name = br.readLine(); // 하나의 나무 종 이름		
		int allCount = 0; // 입력받은 나무 수		

		while (true) {			
			tree_map.put(name, tree_map.getOrDefault(name, 0)+1);			
			allCount++; // 입력받은 나무 수 증가			
			name = br.readLine();			

			if (name == null || name.equals("")) break; // 입력받은 값이 없다면 반복문 빠져나감		
		}				

		// HashMap 키(Key) 정렬				
		Object[] keys = tree_map.keySet().toArray(); 

		// KeySet().toArray()함수를 사용하여 Object형으로 반환하여 key값만 추출 가능		
		Arrays.sort(keys); // 주어진 각 종의 이름을 사전순으로 출력을 위한 정렬				
		StringBuilder sb = new StringBuilder();				

		for (Object key : keys) {			
			String tree_name = (String) key; // 나무 종 이름			
			int count = tree_map.get(tree_name); // tree_name에 해당하는 그루 수			
			double per = (double)(count*100.0) / allCount; // 그 종이 차지하는 비율을 백분율로			
			sb.append(tree_name + " " + String.format("%.4f", per) + "\n"); // 소수점 4째자리까지 반올림		}		
			bw.append(sb.toString() + "\n");		

			bw.flush();		
			bw.close();		
		}

	}
}
