package programers;

import java.util.*;

public class ProTest {
	public static void main(String[] args) {


		int n = 3;
		int[] numlist = {4, 5, 6, 7, 8, 9, 10, 11, 12};
		int num = 0;
		
		for(int i=0; i<numlist.length; i++) {
			if(numlist[i]%n==0) num++;
		}
		
		int[] answer = new int[num];
		int index = 0;
		
		for(int i=0; i<numlist.length; i++) {
			if(numlist[i]%n==0) {
				answer[index] = numlist[i];
				index++;
			}
		}
		
		
		System.out.println(Arrays.toString(answer));
		
	}


}


