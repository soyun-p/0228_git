package ex1_operator;

public class Ex2_op {
	public static void main(String[] args) {
		
		// 비교 연산자 : 변수의 값을 비교하여 참과 거짓을 판단하는 연산자
		
		int a1 = 10;
		int a2 = 20;
		
		boolean res = a1 < a2;  // 연산 결과가 참, 거짓 둘 중 하나기 때문에 res의 자료형은 boolean이다.
		System.out.println(" < : " + res);
		
		res = a1 >= a2;
		System.out.println(" >= : " + res);
	
	    res = a1 == a2;
	    System.out.println(" == : " + res);
	    
	    res = a1 != a2;
	    System.out.println(" != : " + res);
	    
	    
	    
	    System.out.println("-------------------------");
	    
	    
	    
	    // 논리 연산자: 비교 연산자를 통한 연산이 두 개 이상 필요할 때 사용. 앞쪽 연산이 거짓이면 뒤쪽 연산을 수행하지 않는다.
	    
	    int age = 25;
	    int limit = 30;
	    
	    // and 연산자 : 양쪽 값 모두 참이어야  참이고 나머지는 모두 거짓. ( true && true = true )
	    res = (limit - age) > 5   &&   (age+=5) > 30;  // 논리 연산자의 결과도 참, 거짓 둘 중 하나이기에 자료형으로 boolean을 사용한다.
	    System.out.println(age);  // 앞의 연산이 거짓이기 때문에 뒤의 연산은 아예 실행하지 않는다. 따라서 30이 아니라 25를 출력.
	    System.out.println("&&연산 : " + res);
	    
	    
	    
	    // or 연산자 : 양쪽 값 모두 거짓이어야 거짓이고 나머지는 모두 참. (false || false = false) 앞쪽 연산
	    // 앞쪽 연산이 참이면 뒤쪽 연산은 실행하지 않는다.
	    int n1 = 10;
	    int n2 = 20;
	    res = (n1 += 10) > 20  ||  n2 - 10 == 10;  
	    System.out.println("||연산 : " + res);
	    
	    
	    // > : 프로그래밍에서는 반드시 '크다'로 간주. (gt => ' > ' , it => ' < ')
	    
	    
	    // !(not) 연산자 : 결과값의 반대를 의미. (true-> false, false->true)
	    System.out.println(!res);  
	    System.out.println(res);  
	    // ! 연산은 연속성을 가지지 않음. 따라서 !res를 출력한 이후에 res를 출력해도 !res의 반대값이 나오진 않는다.
	    
	    
	    // 증감연산자 : 1씩 증가, 혹은 감소시키는 연산자. (1씩만 가능!)
	    // 선행과 후행 증감의 차이를 잘 알아두자!
	    
	    int a = 10;
	    System.out.println("a : " + ++a);  // ++a = a + 1 => a에 대입, 선행
	    
	    int b = 10;
	    System.out.println("b : " + b++);  // 후행
	    System.out.println(b);   // 후행은 출력보다 연산이 늦다.
	    
	    a++;  // 11 + 1 = 12(62라인에서 ++a가 수행되었기 때문).
	    a--;  // 12 - 1 = 11
	    ++a;  // 11로 시작. 11 + 1 = 12 
	    --a;  // 12로 시작. 12 - 1 = 11
	    a++;  // 11로 시작. 11 + 1 = 12
	    a++;  // 12로 시작. 12 + 1 = 13
	    System.out.println(a++);  // 후행 연산 진행 후 12 + 1 = 13
	    
	    
	    
	} //main

}
