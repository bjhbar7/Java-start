package exam03;

public class InputDateCheckNaN {
public static void main(String[] args) {
	String userInput = "NaN";
	double val = Double.valueOf( userInput ); //입력값을 double 타입으로 변환
	
	double currentBalance = 10000.0;
	
	if(Double.isNaN(val)) {
		System.out.println("NaN이 입력되어 처리할 수 없음");
		val= 0.0;
	} // NaN을 검사하여 , NaN일 경우 실행되는 코드
	
	currentBalance += val;
	System.out.println(currentBalance);
}
}
