package practice04;

public class Drink extends Menu {

	/*
	 *  Menu 클래스를 상속받는 Drink 클래스를 정의합니다.
	       : size(음료 양) 변수를 private로 선언
	       : 기본 생성자, size를 매개변수로 받는 생성자, name과 price, size을 매개 
	         변수로 받는 생성자 정의
	       : size 값을 설정하고 반환하는 setter, getter 정의
	       : sell() 메소드 오버라이딩 
	        >> 음료 종류(name), 사이즈(size), 주문량, 주문가격 출력
	 */


	private int size;

	Drink(){}

	Drink(int size){
		super();

	}

	Drink(String name, int price, int size){
		super(name, price);
		this.size = size;
	}   

	public void sell(int orderQuantity) {
		System.out.println("음료 종류: " + getName() + ", 사이즈(size): " + 
				size + ", 주문량: " + orderQuantity + ", 주문가격: "+ getPrice());   
	}


	public int getSize() {
		return size;
	}

	public void setSize(int size) {
		this.size = size;
	}


}
