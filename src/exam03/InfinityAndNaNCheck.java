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
		System.out.println("�� ���� �Ұ�");
	} else {
	System.out.println(z+2);
/* try { int z = x / y;	
 * System.out.println("z:"+z);
 * } catch(ArithmeticException e) {
 * System.out.println("0���� ������ �ȵ�");}
 */ //catch ��� �����ؼ� ���� ó��
}
}
}