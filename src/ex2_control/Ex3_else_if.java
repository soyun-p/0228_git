package ex2_control;

public class Ex3_else_if {
	public static void main(String[] args) {
		
		// 다중 if문 : 여러 개의 조건 비교가 필요한 경우
		
		/*
		 else-if문 기본식
		 
		 if( 조건식1 ) {
		       조건식1이 참일 때 수행되는 영역
		 }else if( 조건식2 ) {
		       조건식2가 참일 때 수행되는 영역
		 }else{
		     모든 조건이 거짓일 때 반드시 실행되는 영역
		 }
		 
		 */
		
		
		int num = 101;
		String result = "";  // 초기화 방법은 여러가지. null 혹은 그냥 변수 선언만 해놓아도 가능.
		
		
		// && num <= 100을 추가한 것은 그 이상의 값을 잘못 입력했을 때를 위한 것
		if( num >= 90  && num <= 100) { // 90 ~ 100
			result = "A";
		}else if( num >= 80  && num <= 89) { // 80 ~ 89
			result = "B";
		}else if( num >= 70  && num <= 79) { // 70 ~ 79
			result = "C";
		}else if( num >= 60  && num <= 69) { // 60 ~ 69
			result = "D";
		}else if( num >= 0  &&  num <= 59) { // 59 이하는 위의 모든 조건식을 제외한 경우이기 때문에 조건식을 더 쓸 필요 없이 else만 써도 충분하다.
			result = "F";
		}else {
			result = "점수는 0점에서 100점까지만 입력하세요";
		}
		
		System.out.println(result);
		
		
		
		System.out.println("-------------------------------------");
		
		
		
		//예제
		//변수 number에 1 ~ 3 사이의 값을 대입한다. 1을 선택하면 "게임시작", 2는 "설정", 3은 "종료", 
		//number가 1 ~ 3 사이의 값이 아니면 "올바른 메뉴를 입력하세요"를 출력하라.
		
		int number = 1;
		String res = "";
		
		if( number == 1 ) {
			res = "게임시작";  // System.out.println("게임시작"); 으로 써도 가능.
		}else if( number == 2 ) {
			res = "설정";
		}else if( number == 3 ) {
			res = "종료";
		}else {
			res = "올바른 메뉴를 입력하세요";
		}
		
		System.out.println(res);
		
		
	} // main

}
