package ex2_control;

public class Ex5_switch_2 {
	public static void main(String[] args) {
		
		String res = "C";
		String fin = "";
		
		switch( res ) { // 비교값
		case "A":   //조건값
			fin = "90 ~ 100";
			break;
			
		case "B":
			fin = "80 ~ 89";
			break;
			
		case "C":
			fin = "70 ~ 79";
			break;
			
		case "D":
			fin = "60 ~ 69";
			break;
			
		case "F":
			fin = "59점 이하";
			break;
			
		default:
			fin = "올바른 성적을 입력해주세요";
			break;
		
		} // switch
		
		System.out.println(fin);
		
	} // main

}
