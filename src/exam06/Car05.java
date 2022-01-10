package exam06;

public class Car05 {
//필드
	String company = "기아자동차";
	String model;
	String color;
	int maxSpeed;
	
	//생성자
	Car05(){
	}
	
	Car05(String model){
		this(model,"은색", 250);
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
