package ex_work;

public class Ex1_work_calculate {
	public static void main(String[] args) {


		// main + [ ctrl + space ] : main 클래스 생성
		// syso + [ ctrl + space ] : 출력 메서드 생성
		// 해당 문장 드래그 후 ctrl + 슬래쉬(/) : 한 줄 주석
		// ctrl + shift + / : 다중 주석  ,  다중 주석 한 상태에서 ctrl + shift + 역슬래쉬(\) : 다중 주석 해제
		// ctrl + alt + 방향키 : 라인 복사
		// ctrl + i : 자동정렬 1
		// ctrl + shift + F : 자동정렬 2



		/* 예제 1
		  과수원이 있다. 배, 사과, 오렌지를 키우고 있는데 하루에 생산되는 양은 각각 5개, 7개, 5개이다.
		  과수원에서 하루에 생산되는 과일의 총 갯수를 출력하고 시간당 전체 과일의 평균 생산 갯수를 출력하라.

		  단, 과일의 갯수와 평균값을 담을 변수는 float타입으로 할 것.

		 */


		int peer = 5;  // 배
		int apple = 7;  // 사과
		int orange = 5;  // 오렌지

		int total = peer + apple + orange;  // 과일 총 갯수 계산식
		float avg = total / 24F; // 시간당 전체 과일의 평균 생산 갯수 계산식
		// avg는 float로 받지만, 계산은 정수끼리 하기 때문에 24에 F를 붙여서 float로 자료형을 변환해줘야 한다.
		// float avg = (float)total / 24  -> 이와 같이 total의 자료형을 변환해줘도 가능.

		System.out.println("하루생산량 : " + total);  
		System.out.println("시간당 평균 : " + avg);
		
		
		






	} // main

} 
