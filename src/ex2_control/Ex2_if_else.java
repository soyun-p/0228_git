package ex2_control;

public class Ex2_if_else {
	public static void main(String[] args) {


		/*
		  if-else문 기본식

		  if( 조건식 ){
		      조건식이 참일 때 수행하는 영역
		  }else{
		      조건식이 거짓일 때 수행하는 영역
		  }

		 */


		int n = 45;
		String s1 = "하이";

		if( ++n >= 50 ) {
			s1 = "n은 50 이상의 수입니다.";
		}else {
			s1 = "n은 50 미만의 수입니다.";
		}

		System.out.println(n);  // 46 출력. 무조건 조건식을 한 번 거치기 때문에 ++n을 실행하여 n값은 46이 된다.
		System.out.println(s1);



		System.out.println("------------------------------");


		// 변수 age에 나이를 대입하고 30세 이상이면 "드실만큼 드셨군요" 출력, 아니면 "조금 더 드셔도 되겠어요" 출력

		int age = 23;
		String str = "나이";

		if( age >= 30 ) {
			str = "드실만큼 드셨군요";
		}else {
			str = "조금 더 드셔도 되겠어요";
		}

		System.out.println(str);



		System.out.println("-------------------------");



		// 변수 age에 나이를 대입하고 30세 이상이면 "드실만큼 드셨군요" 출력, 아니면 "조금 더 드셔도 되겠어요" 출력
		// 단, 삼항 연산자로 만드시오.
		
		int num1 = 32;
		
		String str1 = "드실만큼 드셨군요";
		String str2 = "조금 더 드셔도 되겠어요";
		
		String quest = num1 >= 30 ? str1 : str2;
		
		System.out.println(quest);
		
		
		
		System.out.println("-------------------");
		
		
		
		







	} // main

}
