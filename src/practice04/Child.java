package practice04;

import java.util.*;

public class Child extends Parents {

	//기본생성자
	Child() {
	}

	//size값을 받는 생성자
	Child(int size) {
		super(size);
		super.size = size;
	}


	@Override
	public void sort() {
		
		descChar();
		for(int i=0; i<size*4; i++) {
			System.out.print("=");
		}
		System.out.println();
		descInt();

		
	}

	public void descInt() {
		
		ascInt();
		
		for(int i=0; i<size-1; i++) {
			for(int j=i+1; j<size; j++) {				
				if(arrInt[i]<arrInt[j]) {
					int temp = arrInt[i];
					arrInt[i] = arrInt[j];
					arrInt[j] = temp;
				}				
			}
		}
				
		System.out.println("내림차순");
		System.out.println(Arrays.toString(arrInt));
	}
	
	public void descChar() {
		
		ascChar();
		
		for(int i=0; i<size-1; i++) {
			for(int j=i+1; j<size; j++) {				
				if(arrChar[i]<arrChar[j]) {
					char temp = arrChar[i];
					arrChar[i] = arrChar[j];
					arrChar[j] = temp;
				}				
			}
		}
				
		System.out.println("내림차순");
		System.out.println(Arrays.toString(arrChar));
	}
}
