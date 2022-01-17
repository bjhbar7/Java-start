package exam06;

public class Car08 {
int speed;

void run() {
	System.out.println(speed + "으로 달립니다.");
}

public static void main(String[] args) {
	Car08 myCar = new Car08();
	myCar.speed = 60;
	myCar.run();
}
}
