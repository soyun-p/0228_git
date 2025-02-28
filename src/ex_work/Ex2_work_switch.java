package ex_work;

public class Ex2_work_switch {
	public static void main(String[] args) {


		// '5월은 31일까지 있습니다'로 출력되는 프로그램
		// 낮은 버전에서는 [ case 1, 2, 3: ] 형식으로 사용할 수 없다.
		// case 1:
		// case 2:
		// 위와 같은 형식으로 사용해야 한다.

		
		int month = 11;
		String res = "";

		switch( month ) {
		case 1: case 3: case 5: case 7: case 8: case 10: case 12:
			res = month + "월은 31일까지 있습니다.";
		    break;

		case 2:
			res = month + "월은 28일까지 있습니다.";
			break;

		case 4, 6, 9, 11:
			res = month + "월은 30일까지 있습니다.";
		    break;

		default:
			res = "올바른 값을 입력하세요";
			break; 
		}
		
		System.out.println(res);
		
		



	} // main

}
