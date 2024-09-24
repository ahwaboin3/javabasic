package c02;

//변수
//컴퓨터 메모리(RAM)는 값을 저장할 수 있는 수많은 번지(주소)들로 구성되어 있습니다
//그런데 메모리의 어디에 저장하고, 어떤 방식으로 저장할지 정해놓지 않으면 프로그램 개발이 무척 어렵게 됩니다.
//프로그래밍 언어는 이 문제를 해결하기 위해 변수하는 개념을 사용합니다.

//변수(variable)는 값을 저장할 수 있는 메모리의 특정 번지에 붙이는 이름입니다.
//프로그램은 변수를 통해 메모리의 특정 번지에 값을 저장하고 읽을 수 있습니다.
//메모리에 값(data)을 저장하고 싶다면 변수를 선언하고 변수에 값을 지정하면 됩니다.
//정수 타입 변수에는 정수값만 저장할 수 있고, 실수 타입 변수에는 실수값만 저장할 수 있습니다. 하나의 변수에 동시에 두 가지 값을 저장할 수 없고, 하나의 값만 저장할 수 있습니다.
public class C02_01 {
	public static void main(String[] args) {
		System.out.println(1+2);
		
		int x=1;
		int y=2;
		System.out.println(x+y);
		
		System.out.println("Hello! Java.");
		System.out.println("Hello! Java.");
		System.out.println("Hello! Java.");
		
		String greet="Hello! Java.";
		System.out.println(greet);
		System.out.println(greet);
		System.out.println(greet);
		
	}
}
