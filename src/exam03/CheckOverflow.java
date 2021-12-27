package exam03;

public class CheckOverflow {
public static void main(String[] args) {
	try {
		int result = safeAdd(2000000000,2000000000);
		System.out.println(result);
	} catch(ArithmeticException e) {
		System.out.println("�����÷ο찡 �߻��Ͽ� ��Ȯ�ϰ� ����� �� ����");
	} // ���� ó�� �ڵ�
}

public static int safeAdd(int left, int right) {
	if((right>0)) {
		if(left>(Integer.MAX_VALUE - right))
		// left + right > Integer.MAX_VALUE �� ����
			{throw new ArithmeticException("�����÷ο� �߻�");
			//���� �߻� �ڵ�			
		}
	} else // right<=0�� ���
	{if(left<(Integer.MIN_VALUE - right)) {
		throw new ArithmeticException("�����÷ο� �߻�");
		//���� �߻� �ڵ�
	}
}
	return left + right;
}
}
