package c07.poly2;

//Tire를 부품으로 가지는 클래스
public class Car {
	private Tire frontLeftTire;
	private Tire frontRightTire;
	private Tire backLeftTire;
	private Tire backRightTire;
	
	//펑크 났을 때 실행
	public void stop() {
		System.out.println("[자동차가 멈춥니다.]");
	}
	
	public int run() {
		System.out.println("[자동차가 달립니다.]");
		if(frontLeftTire.roll()==false) {
			stop();
			return 1;
		}
		if(frontRightTire.roll()==false) {
			stop();
			return 2;
		}
		if(backLeftTire.roll()==false) {
			stop();
			return 3;
		}
		if(backRightTire.roll()==false) {
			stop();
			return 4;
		}
		return 0;
	}
	

}







