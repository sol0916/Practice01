package practice04;

import java.util.Scanner;

public class Menu implements Restaurant {

	/*
	 *  Restaurant 인터페이스에 대한 Menu 이름의 구현 클래스를 정의합니다.
	       : name, price 변수를 private로 선언
	       : name, price를 매개변수로 받아 값을 설정하는 생성자 정의
	       : name, price 값을 설정하고 반환하는 setter, getter 정의
	       : sell() 추상 메소드 오버라이딩 / 기능 없음
	 */

	private String name;
	private int price;
	private int orderQuantity;

	Scanner scan = new Scanner(System.in);

	Menu(){}

	Menu(String name, int price){
		this.name = name;
		this.price = price;
	}


	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public int getPrice() {
		return price;
	}


	public void setPrice(int price) {
		this.price = price;
	}


	@Override
	public void sell(int orderQuantity) {
		this.orderQuantity = orderQuantity;
	}









}
