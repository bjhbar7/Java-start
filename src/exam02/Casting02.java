package exam02;

public class Casting02 {
public static void main(String[] args) {
	int i = 128;
	if((i<Byte.MIN_VALUE)||(i>Byte.MAX_VALUE)) /*(i<-128)||(i>127)과 동일 */ {
		System.out.println("byte 타입으로 변환할 수 없습니다.");
		System.out.println("값을 다시 확인해 주세요");
		int x = i - Byte.MAX_VALUE; // 128-127=1  i가 -200이면 -200-127=-327
		int y = i - Byte.MIN_VALUE; // 128-(-128)=256 " 이면 -200-(-128)=-72
		if(x<0) { x = -x;} // " 이면 327
		if(y<0) { y = -y;} // " 이면 72
		if(x<y) //여기서 x,y는 거리를 의미한다.
			{
			System.out.println(i+ "은/는 " + Byte.MAX_VALUE +"보다 큽니다.");
		} else { System.out.println(i+ "은/는 " + Byte.MIN_VALUE + "보다 작습니다.");
	} }else {
		byte b = (byte) i;
		System.out.println(b);
	}
}
}
