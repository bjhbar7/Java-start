package exam06;

public class Car05 {
//�ʵ�
	String company = "����ڵ���";
	String model;
	String color;
	int maxSpeed;
	
	//������
	Car05(){
	}
	
	Car05(String model){
		this(model,"����", 250);
	}
	
	Car05(String model, String color){
		this(model, color, 250);
	}
	
	Car05(String model, String color, int maxSpeed){
		this.model = model;
		this.color = color;
		this.maxSpeed = maxSpeed;
	}
}
