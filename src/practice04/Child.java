package practice04;

import java.util.*;

public class Child extends Parents {

	//기본생성자
	Child() {
	}

	//size값을 받는 생성자
	Child(int size) {
		super.size = size;
	}


	@Override
	public void sort() {
		
		super.asc();
		desc();
	}

	public void desc() {
		
		
		
		
	}

}
