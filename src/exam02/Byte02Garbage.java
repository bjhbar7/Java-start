package exam02;

public class Byte02Garbage {
public static void main(String[] arg) {
	byte var1 = 125;
	int var2 = 125;
	for(int i=0; i<5; i++) {
		var1++;
		var2++;
		System.out.println("var1:" + var1 + "\t" + "var2: " + var2);
		// \t�� tab��ŭ ĭ�� ����ִ� ������ �Ѵ�.
	}
}
}
