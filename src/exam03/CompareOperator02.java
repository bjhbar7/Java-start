package exam03;

public class CompareOperator02 {
public static void main(String[] args) {
	int v2 = 1;
	double v3 = 1.0;
	System.out.println(v2 == v3);
	
	double v4 = 0.1;
	float v5 = 0.1f;
	System.out.println(v4==v5);
	System.out.println((float)v4 == v5);
	System.out.println((int)(v4*10) == (int)(v5*10));
	System.out.printf("%.52f", v4);
	System.out.printf("%.52f", v5);
	//�ε��Ҽ��� Ÿ���� 0.1�� ��Ȯ�� ǥ�� �Ұ� // float ���� 23 double ���� 52 �� �����ϴ�
}
}
