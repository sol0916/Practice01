package practice04;

public class Steak extends Menu {

	/*
	 *  Menu 클래스를 상속받는 Steak 클래스를 정의합니다.
	       : perGram(스테이크 1인분 양) 변수를 private로 선언
	       : 기본 생성자, perGram을 매개변수로 받는 생성자, name과 price, perGram을 매개 
	         변수로 받는 생성자 정의
	       : perGram값을 설정하고 반환하는 setter, getter 정의
	       : sell() 메소드 오버라이딩 
	       >> 스테이크 종류(name), 무게(perGram), 주문량, 주문가격 출력
	 */

	private int perGram;


	Steak(){      
	}

	Steak(int perGram) {
		this.perGram = perGram;
	}

	Steak(String name, int price, int perGram){
		super(name, price);
		this.perGram = perGram;
	}   

	public void sell(int orderQuantity) {
		System.out.println("스테이크 종류: " + getName() + ", 1인분 무게(g): " + 
				perGram + ", 주문량: " + orderQuantity + ", 주문가격: "+ getPrice());   
	}



	public int getPerGram() {
		return perGram;
	}

	public void setPerGram(int perGram) {
		this.perGram = perGram;
	}


}
