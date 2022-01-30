package exam07;

public class ChildExample {
	public static void main(String[] args) {
		Child child = new Child();
		
		Parent parent = child;
		parent.method1();
		parent.method2();
		//parent.method3();
		//호출 불가 : Child 객체가 Parent 타입으로 변환된 이후 호출이 불가능하다.
	}
}
