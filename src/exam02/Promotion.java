package exam02;

public class Promotion {
public static void main(String[] args) {
	byte byteValue = 10;
	int intValue = byteValue; //int <- byte
	System.out.println(intValue);
	
	char charValue = '��';
	intValue = charValue; //int <- char
	System.out.println("���� �����ڵ�=" + intValue);
	char charData = (char) intValue;
	System.out.println(intValue + "�� ���ڴ� " + charData + "�Դϴ�.");
	
	intValue = 500;
	long longValue = intValue; //long <- int
	System.out.println(longValue);
	
	intValue = 200;
	double doubleValue = intValue; //double <- int
	System.out.println(doubleValue);
}
}
