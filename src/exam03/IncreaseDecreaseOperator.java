package exam03;

public class IncreaseDecreaseOperator {
public static void main(String[] args) {
	int x = 10;
	int y = 10;
	int z;
	
	System.out.println("--------");
	x++;
	++x;
	System.out.println("x=" + x);
	
	System.out.println("--------");
	y--;
	--y;
	System.out.println("y=" + y);
	
	System.out.println("--------");
	z = x++; // 저장 후 계산 // 피연산자의 결과를 다시 피연산자에 저장
	System.out.println("z=" +z);
	System.out.println("x=" +x);
	
	System.out.println("--------");
	z = ++x;
	System.out.println("z=" + z);
	System.out.println("x=" + x);
	
	System.out.println("--------");
	z = ++x + y++;
	System.out.println("z=" +z);
	System.out.println("x=" +x);
	System.out.println("y=" +y);
}
}
