package exam03;

public class InfinityAndNaNCheck {
public static void main(String[] args) {
	int x = 5;
	double y = 0.0;
	
	double z = x / y;
	//double z = x % y;
	
	System.out.println(Double.isInfinite(z));
	System.out.println(Double.isNaN(z));
	
	if(Double.isInfinite(z) || Double.isNaN(z)) {
		System.out.println("값 산출 불가");
	} else {
	System.out.println(z+2);
/* try { int z = x / y;	
 * System.out.println("z:"+z);
 * } catch(ArithmeticException e) {
 * System.out.println("0으로 나누면 안됨");}
 */ //catch 블록 실행해서 예외 처리
}
}
}