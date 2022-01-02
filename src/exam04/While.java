package exam04;

public class While {
public static void main(String[] arg) {
	int i = 1;
	while (i<=10) {
		System.out.println(i);
		i++;
	}
	int sum = 0;
	int j = 1;
	while(j<=100) {
		sum += j;
		j++;
	}
	System.out.println("1~" + (j-1) + " гу : " + sum);
}
}
