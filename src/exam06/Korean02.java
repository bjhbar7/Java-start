package exam06;

public class Korean02 {
public static void main(String[] args) {
	Korean k1 = new Korean("���ڹ�", "111111-1234567");
	System.out.println("k1.name: " + k1.name);
	System.out.println("k1.ssn: " +k1.ssn);
	System.out.println("k1.nation: " +k1.nation);
	
	Korean k2 = new Korean("���ڹ�", "222222-1234567");
	System.out.println("k2.name: " +k2.name);
	System.out.println("k2.ssn: " +k2.ssn);
	System.out.println("k2.nation: " +k2.nation);
}
}
