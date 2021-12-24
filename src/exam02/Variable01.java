package exam02;

public class Variable01 {
public static void main(String[] args) {
	//메소드 블록 내에서 선언된 변수를 로컬 변수(local variable),로컬 변수는  메소드 실행이 끝나면 메모리에서 자동으로 없어진다.
	//10을 변수 value의 초기값으로 저장
	int value = 10;
	
	//변수 value 값을 읽고 10을 더하는 산술 연산을 수행
	//연산의 결과값을 변수 result의 초기값으로 저장
	int result = value + 10;
	
	//변수 result 값을 읽고 콘솔에 출력
	System.out.println(result);
}
}
