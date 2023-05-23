package practice04;

public class TvMain {

	public static void main(String[] args) {

		/*
		💡 문제
		인터페이스, 상속, 다형성을 통해서 TV, SmartTv, 에어컨에서 작동할 수 있는 리모컨을 만들어주세요.
		아래 주어진 코드를 상황에 맞게 extends, implements를 통해 적절하게 클래스 관계를 설정하고 코드를 보완하고 결과물과 같이 출력해주세요.
		MainClass에서 객체 형성 시
		부모(상위)클래스 참조변수로 객체 생성 하고 메서드를 호출하여 출력해주세요.
		 */
		
		
		//tv, smartTv
		RC tv = new SmartTv();
		SmartTv sTv = (SmartTv)tv;
		
		tv.on();
		sTv.iptv();
		sTv.youtube();
		
		for(int i=0; i<5; i++) {
			tv.up();
		}
		for(int i=0; i<5; i++) {
			tv.down();
		}

		//에어컨
		RC ac = new AC();
		
		for(int i=0; i<8; i++) {
			ac.down();
		}
		for(int i=0; i<17; i++) {
			ac.up();
		}

	}

}
