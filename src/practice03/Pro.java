package practice03;

import java.util.Arrays;

public class Pro {

	public static void main(String[] args) {
		
		String str = "10 Z 20 Z 1";
		
		String[] num = str.split(" ");
		int[] arrInt = new int[str.length()];
		
		System.out.println(Arrays.toString(num));
		
	}

}
