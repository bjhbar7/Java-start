package exam03;

public class BitLogic {
public static void main(String[] args) {
	System.out.println("45 & 25 =" + (45 & 25));
	System.out.println("45 | 25 =" + (45 | 25));
	System.out.println("45 ^ 25 =" + (45 ^ 25));
	System.out.println("~45 =" + (~45));
	
	//BitShift
	System.out.println("1 << 3 =" + (1<<3));
	System.out.println("-8 >> 3 =" + (-8>>3));
	System.out.println("-8 >>> 3 =" + (-8>>>3));
}
}
