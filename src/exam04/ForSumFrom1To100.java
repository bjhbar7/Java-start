package exam04;

public class ForSumFrom1To100 {
public static void main(String[] args) {
	int sum = 0;
	int i = 0; 
	int j = 0;
	//for(int i = 1; i<=100; i++){} ����ϸ� for�� �ۿ��� ��� �Ұ�
	for(i=1; i<=100; i++) {
		sum += i;	
	}
	
	for(j=1; j<=10; j++) {
		System.out.println(j);
	}
	System.out.println("1~" + (i-1) + " �� : " +sum);
}
}
