package otherstudyteam;

import java.util.*;

public class Quiz01 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int n =sc.nextInt();
		System.out.println(Quiz01.soulution(n));
	}

	//소수의 개수 찾기 (에라토스테네스 체)
	public static int soulution(int n) {
		int answer = 0; //소수 count할 변수
		int[] ch = new int[n+1]; //0은 안쓸거고 1부터 쓸거니까 n보다 하나더 많이

		for(int i=2; i<=n; i++) { //0번째 index 안쓰고 2부터 소수니까
			if(ch[i]==0) { //해당 인덱스가 소수라면 answer ++ 할 것 2부터 소수니까
				//2부터 체크하고 2의 배수도 전부 체크
				answer++;
				for(int j=i; j<=n; j+=i) {
					ch[j] =1; //소수로 체크된 인덱스의 배수들 전부 체크
					//소수의 배수는 소수가 아니기 때문
				}  

			}
		}
		return answer;
	}
}


