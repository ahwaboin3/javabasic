package c08.fieldpoly;

//인터페이스의 타입 변환과 타형성
//프로그램을 개발할 때 인터페이스를 사용해서 메소드를 호출하도록 코딩했다면
//구현 객체를 매우 손쉽고 빠르게 교체할 수 있습니다.
//프로그램 소스 코드는 변함이 없는데, 구현 객체를 교체함으로써
//프로그램의 실행결과가 다양해집니다. 이것이 인터페이스의 다형성입니다.

//자동 타입 변환
//구현 객체가 인터페이스 타입으로 변환되는 것은 자동 타입 변환에 해당합니다.
//인터페이스 변수 =(자동 타입 변환) 구현 객체;
//public class MyClass extends SuperMyClass implements MyInterface{}
//인터페이스A->구현 클래스B->자식 클래스C
//A=B, A=C

//필드의 다형성
public class Car {
//	private Tire t=new HankookTire();
	private Tire t=new KumhoTire();
	
	public void run() {
		t.roll();
	}
	
	public static void main(String[] args) {
		Car car=new Car();
		car.run();
	}
}







