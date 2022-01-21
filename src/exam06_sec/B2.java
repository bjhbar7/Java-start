package exam06_sec;

public class B2 {
public B2() {
	A2 a = new A2();
	a.field1 = 1;
	a.field2 = 1;
	// a.field3 = 1; - private 필드 접근 불가
	
	a.method1();
	a.method2();
	// a.method3(); - private 필드 접근 불가
}
}
