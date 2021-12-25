package exam02;

public class Promotion {
public static void main(String[] args) {
	byte byteValue = 10;
	int intValue = byteValue; //int <- byte
	System.out.println(intValue);
	
	char charValue = '가';
	intValue = charValue; //int <- char
	System.out.println("가의 유니코드=" + intValue);
	char charData = (char) intValue;
	System.out.println(intValue + "의 문자는 " + charData + "입니다.");
	
	intValue = 500;
	long longValue = intValue; //long <- int
	System.out.println(longValue);
	
	intValue = 200;
	double doubleValue = intValue; //double <- int
	System.out.println(doubleValue);
}
}
