package ex2_control;

public class Ex4_switch_1 {
	public static void main(String[] args) {
		
		// switch-case문 : 조건식이 아닌 값을 통해 원하는 결과를 도출하기 위한 제어문
		
		/* switch-case문 기본식
		 
		 switch( 비교값 ){
		    case 조건값1: 
		        비교값과 조건값1이 일치할 때 실행되는 영역
		    break;
		    
		    case 조건값2:
		        비교값과 조건값2가 일치할 때 실행되는 영역
		    break;
		    
		    default:
		        비교값과 일치하는 조건값이 한 개도 없을 때 실행되는 영역
		    break;
		 }                                                                 
          
          */
		
		
		int n =5;
		switch( n ) { // 비교값
		    case 1:   // 조건값   비교값(n)과 조건값(1, 2, 3)의 자료형은 같아야 한다.
		    	System.out.println("1. 게임하기");
			    break;
			
		    case 2:
		    	System.out.println("2. 설정");
		        break;
		    
		    case 3:
		    	System.out.println("3. 종료");
		        break;
		
		    default:  // default는 비교값을 넣을 수 없다. 모든 케이스의 조건값과 맞지 않으면 실행되는 영역이기 때문이다.
		    	System.out.println("올바른 값을 입력하세요");
		    	break;
		    
		} // switch
		
		// if문은 조건별로 한 단계씩 차례차례 거쳐서 맞는 결과를 도출하는 반면,
		// switch문은 비교값에 맞는 조건값을 단번에 찾아서 바로 실행한다. 따라서 속도 부분에서 매우 빠르다.
		// 그러나 switch문은 조건식에 범위를 넣을 수 있는 if문과 달리 조건값에 범위를 넣을 수 없기 때문에 
		// 범위 지정의 필요성 여부에 따라 잘 골라 사용해야 한다.
		
		
		
	} // main

}



