package practice04;

import java.util.*;
import java.io.*;

public class RestaurantMain {

	public static void main(String[] args) {
		
	      /*
	       *  메인 클래스에서 메뉴 생성 및 sell() 호출 
	          : Menu[] m을 크기 4로 선언
	          : Steak와 Drink 생성자를 사용하여 (이름, 가격, 양)을 인수로 보내 객체 생성
	          : 출력 결과와 같이  sell()을 사용하여 출력
	       */
	            
		Scanner scan = new Scanner(System.in);

	      Menu[] m = new Menu[4];
	      	      
	      //Steak[] s1 = new Steak[4];
	      
	      m[0] = new Steak("안심", 90000, 150);
	      m[1] = new Drink("와인", 8000, 350);
	      m[2] = new Steak("등심", 105000, 160);
	      m[3] = new Drink("와인", 16000, 350);
	      //m[4] = new Drink("맥주", 30000, 500);
	         
	      
	      for(Menu menu : m) {
	         menu.sell(scan.nextInt());
	      }
	      
	   
	      
	   }
	}

