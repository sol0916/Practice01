package practice04;

public interface Restaurant {

	  /*
	    * 레스토랑에서 스테이크와 음료를 주문하는 프로그램을 만들어 봅시다.

	   1. Restaurant 인터페이스를 정의합니다. 
	    : sell() 추상 메소드 선언 / void sell(int orderQuantity)

	   2. Restaurant 인터페이스에 대한 Menu 이름의 구현 클래스를 정의합니다.
	    : name, price 변수를 private로 선언
	    : name, price를 매개변수로 받아 값을 설정하는 생성자 정의
	    : name, price 값을 설정하고 반환하는 setter, getter 정의
	    : sell() 추상 메소드 오버라이딩 / 기능 없음

	   3. Menu 클래스를 상속받는 Steak 클래스를 정의합니다.
	    : perGram(스테이크 1인분 양) 변수를 private로 선언
	    : 기본 생성자, perGram을 매개변수로 받는 생성자, name과 price, perGram을 매개 
	      변수로 받는 생성자 정의
	    : perGram값을 설정하고 반환하는 setter, getter 정의
	    : sell() 메소드 오버라이딩 
	       >>  스테이크 종류(name), 무게(perGram), 주문량, 주문가격 출력

	   4. Menu 클래스를 상속받는 Drink 클래스를 정의합니다.
	    : size(음료 양) 변수를 private로 선언
	    : 기본 생성자, size를 매개변수로 받는 생성자, name과 price, size을 매개 
	      변수로 받는 생성자 정의
	    : size 값을 설정하고 반환하는 setter, getter 정의
	    : sell() 메소드 오버라이딩 
	       >>  음료 종류(name), 사이즈(size), 주문량, 주문가격 출력

	   5. 메인 클래스에서 메뉴 생성 및 sell() 호출 
	    : Menu[] m을 크기 4로 선언
	    : Steak와 Drink 생성자를 사용하여 (이름, 가격, 양)을 인수로 보내 객체 생성
	    : 출력 결과와 같이  sell()을 사용하여 출력
	    */



	   abstract void sell(int orderQuantity);
	   
	   

	
}
