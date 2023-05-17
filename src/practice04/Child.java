package practice04;

import java.util.*;

public class Child extends Parents {

	//기본생성자
	Child() {
	}

	//size값을 받는 생성자
	Child(int size) {
		super();
		super.size = size;
	}


	@Override
	public void sort() {

		super.asc();
		desc();

		System.out.println(Arrays.toString(arrInt));
		Arrays.sort(arrInt);
		System.out.println("오름차순");
		System.out.println(Arrays.toString(arrInt));

		//이렇게까지 한다고...?
		for(int i=0; i<size*3; i++) {
			System.out.print("=");
		}

		System.out.println();
		System.out.println(Arrays.toString(arrChar));
		Arrays.sort(arrChar);
		System.out.println("오름차순");
		System.out.println(Arrays.toString(arrChar));
	}

	public void desc() {
		
		arrInt = new int[size];
		arrChar = new char[size];
		
		asc();

		System.out.println(Arrays.toString(arrInt));
		System.out.println(Arrays.toString(arrChar));


	}

}
