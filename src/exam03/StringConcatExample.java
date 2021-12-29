package exam03;

public class StringConcatExample {
public static void main(String[] args) {
	String str1 = "ABC" + 6.0;
	String str2 = str1 + "Ư¡";
	System.out.println(str2);
	
	String str3 = "ABC" + 3 + 3.0;
	String str4 = 3 + 3.0 + "ABC";
	System.out.println(str3);
	System.out.println(str4);
}
}
