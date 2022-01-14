package exam06;

public class CarExam {
public static void main(String[] args) {
	Car06 myCar = new Car06();
	myCar.keyTurnOn();
	myCar.run();
	int speed = myCar.getSpeed();
	System.out.println("현재 속도: " + speed + "km/h");
	
}
}
