package ex2_control;

public class Ex6_switch_3 {
	public static void main(String[] args) {
		
		char last = '이';
		String result = "";	
		
		// switch문의 비교값은 정수(byte, short, int), 문자, 문자열만 포함 가능.
		// break를 쓰지 않는 경우도 있긴 하다.
		// 그러나 break를 빼면 다음 break를 찾을 때까지 내려가다가(실행되다가) 브레이크를 찾으면 해당 결과가 출력된다.
		// break가 다 빠지면 스위치 문 가장 마지막에 있는 실행문이 출력된다.
		
		// 만약 박씨에만 break가 있고, last가 이씨면 이씨는 박씨보다 위에 있기 때문에 상관없이 박씨 값이 출력된다.
		// 박씨보다 아래 있는 성씨가 last에 대입되면, 가장 끝에 있는 실행문이 출력된다. 왜?
		
		
		switch( last ) {  // 비교값
		case '김':
			result = "200만";
			break;  
			
		case '이':
			result = "144만";
			break;
			
		case '박':
			result = "78만";
			break;
			
		default:
			result = "준비중입니다.";
			break;
			
			
		} // switch
		
		System.out.println(result);
		
	} // main

}
