package exam02;

public class Var02 {
	public static void main(String[] args) {
		int v1 = 15;
		if(v1>10) {
			int v2 = v1 - 10;
			int v3 = v1 + v2 + 5;
			System.out.println(v3);
		}
		// 이곳에 int v3 = v1 + v2 + 5; 을 사용하면 v2 변수를 사용할 수 없기 때문에 컴파일 에러가 생김
	}

}
