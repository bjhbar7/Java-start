package exam02;

public class Casting02 {
public static void main(String[] args) {
	int i = 128;
	if((i<Byte.MIN_VALUE)||(i>Byte.MAX_VALUE)) /*(i<-128)||(i>127)�� ���� */ {
		System.out.println("byte Ÿ������ ��ȯ�� �� �����ϴ�.");
		System.out.println("���� �ٽ� Ȯ���� �ּ���");
		int x = i - Byte.MAX_VALUE; // 128-127=1  i�� -200�̸� -200-127=-327
		int y = i - Byte.MIN_VALUE; // 128-(-128)=256 " �̸� -200-(-128)=-72
		if(x<0) { x = -x;} // " �̸� 327
		if(y<0) { y = -y;} // " �̸� 72
		if(x<y) //���⼭ x,y�� �Ÿ��� �ǹ��Ѵ�.
			{
			System.out.println(i+ "��/�� " + Byte.MAX_VALUE +"���� Ů�ϴ�.");
		} else { System.out.println(i+ "��/�� " + Byte.MIN_VALUE + "���� �۽��ϴ�.");
	} }else {
		byte b = (byte) i;
		System.out.println(b);
	}
}
}
