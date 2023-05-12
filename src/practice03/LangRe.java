package practice03;

import java.util.Arrays;

public class LangRe {
	
	public static void main(String[] args) {
		
	
	//Math 클래스
	
	System.out.println(Math.abs(-5)); //절대값
	System.out.println(Math.ceil(6.5)); //올림
	System.out.println(Math.floor(5.6)); //내림
	System.out.println(Math.max(5, 3)); //max
	System.out.println(Math.round(8.3)); //반올림
	
	
	//StringBuilder
	StringBuilder sb = new StringBuilder("hello");
	
	
	System.out.println(sb.append(" hihi")); //끝에 추가
	System.out.println(sb.insert(2, "~~")); //중간에 추가
	System.out.println(sb.replace(8, 10, "")); //값 변경 (이상, 미만)
	System.out.println(sb.delete(2, 4)); //값 제거 (이상, 미만)
	System.out.println(sb.reverse()); //뒤집기
	
	//최종적으로 toString()으로 형변환을 해줘야 함
	System.out.println(sb.toString());
	
	
	//String 
	String str = "안녕하세요";
	
	//한글자 자르기 (charAt)
	System.out.println(str.charAt(0));
	
	//찾으면 인덱스 번호는 반환, 없으면 -1을 반환 (indexOf)
	System.out.println(str.indexOf("하"));
	System.out.println(str.indexOf("없을걸"));
	
	//문자열 끝에서부터 값을 찾음 (lastIndexOf)
	System.out.println(str.lastIndexOf("세"));
	
	//값이 있다면 true, 없다면 false (contains)
	System.out.println(str.contains("안녕"));
	System.out.println(str.contains("없네"));
	
	//길이(length)
	System.out.println(str.length());
		
	//문자열 변경 (replace)
	System.out.println(str.replace("세요", "십니까"));

	//문자열 자르기(subString, split)
	System.out.println(str.substring(3));
	System.out.println(str.substring(0, 2));
	
	String str2 = "자바 공부는 어려워요";
	String[] result = str2.split(" ");
	System.out.println(Arrays.toString(result));
	
	//배열 한글자씩 전부 자르기 (toCharArray)
	char[] result2 = str2.toCharArray();
	System.out.println(Arrays.toString(result2));
		
	//문자열 비교 (equals)
	if(str.equals("안녕하세요")) {
		System.out.println("일치합니다");
	}
	
	//사전 등재순 비교 (compareTo) 
	System.out.println(str.compareTo("헤헤")); //음수 - str이 해당 글자보다 사전등재가 더 앞임
	System.out.println(str.compareTo("안녕하세요")); //같은 값이면 0 반환
	
	//특정 구분자로 문자열 연결 (join)
	System.out.println(str.join("-", "이제는", "우리가", "집에", "가야 할","시간"));
	
	//기본타입을 문자열로 연결 (valueOf)
	System.out.println(String.valueOf(1)+String.valueOf(3));
	

	}
}
