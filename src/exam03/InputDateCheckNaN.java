package exam03;

public class InputDateCheckNaN {
public static void main(String[] args) {
	String userInput = "NaN";
	double val = Double.valueOf( userInput ); //�Է°��� double Ÿ������ ��ȯ
	
	double currentBalance = 10000.0;
	
	if(Double.isNaN(val)) {
		System.out.println("NaN�� �ԷµǾ� ó���� �� ����");
		val= 0.0;
	} // NaN�� �˻��Ͽ� , NaN�� ��� ����Ǵ� �ڵ�
	
	currentBalance += val;
	System.out.println(currentBalance);
}
}
