package otherstudyteam;

import java.util.*;
import java.util.Map.Entry;

public class F230621 {

	public static void main(String[] args) {

		//전체 단어에서 찾기
		
		String[] words = { "better", "vest", "raspy", "tearful", "dream", "accept", "ignore", "elfin", "pat", "wail",
				"itchy", "attract", "unpack", "assorted", "month", "cast", "beef", "arithmetic", "petite", "umbrella",
				"kaput", "frightened", "frame", "abounding", "yak", "resonant", "trace", "simplistic", "three", "slip",
				"train", "name", "lock", "windy", "guide", "calm", "tedious", "decisive", "illustrious", "exciting",
				"lamp", "adamant", "average", "finger", "sack", "vanish", "damaged", "bed", "compare", "notebook",
				"beds", "delight", "cowardly", "unknown", "shiver", "kill", "bright", "greedy", "makeshift", "cellar",
				"owe", "pack", "water", "paper", "rub", "incompetent", "neck", "tense", "airport", "cheap", "structure",
				"gaudy", "wound", "knot", "park", "simple", "brush", "fail", "volatile", "jam", "chubby", "pour",
				"load", "abortive", "increase", "knowledge", "meal", "cream", "stitch", "laugh", "treatment", "reach",
				"approval", "war", "kindhearted", "comparison", "past", "standing", "crown", "society" };


		Map<String, Integer> map = new HashMap<>();
		int value = 0;

		//전체 
		for(int i=0; i<words.length; i++) {

			if(words[i].length()>=5 && words[i].length()<=15) {

				String[] arr = new String[words[i].length()];				
				arr = words[i].split("");

				for(int j=0; j<arr.length; j++) {
					if(map.containsKey(arr[j])) {
						map.put(arr[j], map.get(arr[j])+1); 
					} else {
						value = 0;
						value++;
						map.put(arr[j], value);
					}		
				}
				
				arr = null; 

			}


		}


		//최댓값 찾기
		int max = 0;
		String a = "";
		Set<Entry<String, Integer>> entrySet = map.entrySet();
		for(Entry<String, Integer> entry : entrySet) {
			if(max<entry.getValue()) {
				max = entry.getValue();
				a = entry.getKey();
			}
		}

		
		System.out.println(map);
		System.out.println("가장 많이 사용되는 단어: "+a);



	}

}
