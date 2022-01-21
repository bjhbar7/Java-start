package exam06_third;

import exam06_sec.A2;

public class C2 {
public C2() {
	A2 a = new A2();
	a.field1 = 1;
	//a.field2 = 1; - default 필드 접근 불가
	//a.field3 = 1; - private 필드 접근 불가
	
	a.method1();
	//a.method2(); - default 필드 접근 불가
	//a.method3(); - private 필드 접근 불가
}
}
