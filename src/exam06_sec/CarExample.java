package exam06_sec;

public class CarExample {
public static void main(String[] args) {
	Car02 myCar = new Car02();
	
	//�߸��� �ӵ� ����
	myCar.setSpeed(-50);
	
	System.out.println("���� �ӵ�: " + myCar.getSpeed());
	
	//�ùٸ� �ӵ� ����
	myCar.setSpeed(60);
	
	//����
	if(!myCar.isStop()) {
		myCar.setStop(true);
	}
	
	System.out.println("���� �ӵ�: " + myCar.getSpeed());
}
}
