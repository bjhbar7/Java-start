package exam06;

public class CarGasExam {
public static void main(String[] args) {
	CarGas myCar = new CarGas();
	
	myCar.setGas(5); //Car�� setGas() �޼ҵ� ȣ��
	
	boolean gasState = myCar.isLeftGas(); //Car�� isLeftGas() �޼ҵ� ȣ��
	if(gasState) {
		System.out.println("����մϴ�.");
		myCar.run(); //Car�� run() �޼ҵ� ȣ��
	}
	
	if(myCar.isLeftGas()) { //Car�� isLeftGas() �޼ҵ� ȣ��
		System.out.println("gas�� ������ �ʿ䰡 �����ϴ�.");
	} else {
		System.out.println("gas�� �����ϼ���.");
	}
}
}
