package programers;

public class babbling {

	public static void main(String[] args) {

		String[] str = new String[] {"ayaye", "uuuma", "ye", "yemawoo", "ayaa"};

		String[] list = new String[] {"aya", "ye", "woo", "ma"};

		int answer = 0;

		for(int i=0; i<str.length; i++) {
			for(int j=0; j<list.length; j++) {
				if(str[i].contains(list[j])) {
					answer++;
				}
			}
		}

		System.out.println(answer);
	}
}
