package ex2_control;

public class Ex1_if {
	public static void main(String[] args) {
		
		/*
		 제어문(control statement) : 프로그램의 흐름을 제어하는 문장
		 
		 1. 분기문 : if, if-else, else-if, switch
		 2. 반복문 : for, while, do-while	 
		 
		 */
		
	 
		/* 단순 if문 기본식 : 조건식은 반드시 참과 거짓의 형식으로 답할 수 있는 조건으로 입력
		 
		 if( 조건식 ){
		     조건식이 참일 때 실행되는 영역
		}                                      */

	
		int n = 51;
		String str = "안녕하세요";  // String은 쌍따옴표 안에 여러 글자를 저장할 수 있는 자료형
		
		// if문을 만나면 조건식을 먼저 확인한다.
		if( n == 50 ) {
			// 조건이 참일 때만 if문 영역 안으로 들어온다.
			str = "반갑습니다";
		} // if 1
		
		if( n != 50 ) {
			str = "고맙습니다";
		} // if 2             그러나 if문을 여러 개 쓰면 복잡
		
		System.out.println(str);
		
		
		
		
		
		
	} // main

}




