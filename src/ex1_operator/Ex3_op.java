package ex1_operator;

public class Ex3_op {

	public static void main(String[] args) {

		//삼항(조건) 연산자 : 조건식을 통해 참, 혹은 거짓의 결과에 따른 값을 만드는 연산자

		int a = 10;
		int b = 5;

		int res = ++a >= b ? 1 : 0;  // : 양옆의 값의 타입은 같아야 한다.
		System.out.println(res);

		int n1 = 10;
		int n2 = 20;
		char res2 = ( n1 += n1 ) == n2 ? 'o' : 'x';  // 조건식의 결과가 문자형이기 때문에 결과를 담는 변수의 자료형도 문자형으로 받는다.
		System.out.println(res2);


		// 예제
		a = 10;
		b = 12;
		res2 = ++a >= b  ||  b - a + ( a - 3 ) <= b  &&  b + 1 -b >= 0  &&  ( a += b ) - ( a % b ) > 10 ? 'o' : 'x';
		// true || true -> true, true && true-> true, true && true -> true  ==> true 'o'
		// 논리연산자는 순서대로 진행  

		System.out.println(res2);



	} // main

}
