package exam06_third;

import exam06_sec.A2;

public class C2 {
public C2() {
	A2 a = new A2();
	a.field1 = 1;
	//a.field2 = 1; - default �ʵ� ���� �Ұ�
	//a.field3 = 1; - private �ʵ� ���� �Ұ�
	
	a.method1();
	//a.method2(); - default �ʵ� ���� �Ұ�
	//a.method3(); - private �ʵ� ���� �Ұ�
}
}
