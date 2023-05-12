package programers;

public class CtrlZ {

	public static void main(String[] args) {
		
		String s = "10 Z 20 Z 1";
		int answer = 0;

		String[] arrStr = s.split(" ");
		
		System.out.println(arrStr.toString());
		
		for(int i=0; i<arrStr.length; i++) {			
			if(arrStr[i].equals("Z")) {
				answer -= Integer.parseInt(arrStr[i-1]);
			} else {
				answer += Integer.parseInt(arrStr[i]);
			}
		}
			System.out.println(answer);
			
			
			

	}

}
