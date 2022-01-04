package exam05;

public class ArrayCreateByValueList02 {
public static void main(String[] args) {
	int[] scores;
	scores = new int[] {83,90,87};
	int sum1 = 0;
	for(int i=0; i<3; i++) {
		sum1 += scores[i];
	}
	System.out.println("ÃÑÇÕ : " + sum1);
	
	int sum2 = add(new int[] {83, 90, 87}); // add(int[] scores); »ç¿ë ºÒ°¡´É
	System.out.println("ÃÑÇÕ : " + sum2);
	System.out.println();
}

public static int add(int[] scores) {
	int sum = 0;
	for(int i=0; i<3; i++) {
		sum += scores[i];
	}
	return sum;
}
}
