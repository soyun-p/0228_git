package ex_work;

public class My_practice {
	private static final int String = 0;

	public static void main(String[] args) {
		
		/* 
		int month = 13;	
		int date = 0; // 초기화시켜야 함.

		switch( month ) {
		case 1, 3, 5, 7, 8, 10, 12: // 낮은 버전에서는 이렇게 안되고 case n: 을 여러개 쓰는 방법으로 사용.
			date = 31;
		break;

		case 2:
			date = 28;
			break;

		case 4, 6, 9, 11:
			date = 30;
		    break;

		default:
			System.out.println("올바른 값을 입력하세요");
			break;
		}
        

		System.out.println(month + "월은 " + date + "일까지 있습니다.");
		*/
		
		
	/*
     준비된 책은 120권이고, 어느 반의 학생은 35명이다. 학생 하나당 2권의 책을 배분할 예정이라고 할 때, 
     반 숫자와 학생 수를 입력받아 반에서 필요한 책의 총 권수, 부족하다면 부족한 권수, 충분하다면 남는 권수를 출력하라
	 */		
	 
	
	int class_num = 3;  // 반 숫자
	int student_num = 25;   // 학생수 
	
	int personer_book = 3;  // 학생 한 명당 배분할 책의 수
	int prepared_total = 120; // 준비된 책의 수
	
	
	// 반에서 필요한 책의 총 권수를 구하는 계산식
	int need_book_class = student_num * personer_book;
	
	System.out.println(class_num + "반에서 필요한 책은 총 " + need_book_class + " 권입니다.");
	
	
	// 부족한, 혹은 충분한 책의 권수를 구하는 계산식
    String str = "";
    int diff = (need_book_class - prepared_total);

	if( need_book_class > prepared_total ) {
		str = diff + " 권의 책이 부족합니다.";
	}else {
		str = diff + " 권의 책이 남습니다.";
	}
	
	System.out.println(str);
	
	

		
		
		
		
		
		
		
		
		
	} // main

}
