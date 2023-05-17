package practice04;

public class ParentsMain {

	public static void main(String[] args) {
		


		int size = (int)(Math.random()*15)+5;
		
		
		Parents p = new Parents(size);
		Child c = new Child(size);
		
		p.sort();
		c.sort();
		

	}

}
