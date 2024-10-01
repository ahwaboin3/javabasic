package c06;

public class MethodCall {
	//메소드 호출
	//객체 내부에서 호출
	//클래스 내부에서 다른 메소드를 호출할 경우
	//메소드([매개값,...]);
	void method1(String p1, int p2) {
		System.out.println(p1);
		System.out.println(p2);
	}
	void method2() {
		method1("김자바",100);
	}
	
	public static void main(String[] args) {
		//객체 외부에서 호출
		//외부에서 메소드를 호출하려면 클래스로부터 인스턴스를 생성해야 합니다.
		//메소드는 객체에 소속된 멤버이므로 객체가 존재하지 않ㅇ으면
		//메소드도 존재하지 않기 때문입니다.
		MethodCall mc=new MethodCall();
		mc.method2();
	}

}
