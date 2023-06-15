package programers;

public class pro120849 {

	public static void main(String[] args) {
		
		String str = "nice to meet you";
		
		String[] list = new String[] {"a", "e", "i", "o", "u"};
		
		for(int i=0; i<str.length(); i++) {
			for(int j=0; j<list.length; j++) {
				if(String.valueOf(str.charAt(i)).equals(list[j])) {
					str = str.replace(list[j], "");
				}
			}
		}
		
		System.out.println(str);
		
		

	}

}
