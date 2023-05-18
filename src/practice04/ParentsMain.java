package practice04;

public class ParentsMain {

	public static void main(String[] args) {
		
		//배열의 랜덤 값
		int size = (int)(Math.random()*15)+5;
		
		Child c = new Child(size);	//자식클래스	
		c.sort(); 

		
	}

}
