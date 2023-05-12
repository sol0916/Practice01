package practice02;

public class Split {
	
	public static void main(String[] args) {
		
		String str = "010-123-4567";
		String[] mobNum = str.split("-");
		String ret1 = mobNum[0];
		String ret2 = mobNum[1];
		String ret3 = mobNum[2];
		
		System.out.println("ret1 = "+ret1);
		System.out.println("ret2 = "+ret2);
		System.out.println("ret3 = "+ret3);
		
		
	
	}

}
