package c02;

//타입 변환
//타입 변환이란 데이터 타입을 다른 데이터 타입으로 변환하는 것
//예를 들어, byte 타입을 int 타입으로 변환하거나
//반대로 int 타입을 byte타입으로 변환하는 행위를 말합니다.
public class C02_03_01 {
	public static void main(String[] args) {
		//두 변수의 타입이 동일할 경우,
		//한쪽 변수값을 다른 쪽 변수에 복사해서 저장할 수 있습니다.
		int n1=42;
		int n2=n1;
		System.out.println(n2);
		
		byte a=10;
		int b=a;
		String c="10";
//		a=b;
//		b=c;
		//만약 두 변수의 타입이 다를 때 복사해서 저장할려면
		//값의 저장이 가능할 수도 있고 그렇지 않을 수도 있습니다.
		
		//자동 타입 변환
		//자동 타입 변환은 값의 허용 범위가 작은 타입이
		//허용 범위가 큰 타입으로 저장될  때 발생합니다.
		//기본 타입을 허용 범위 크기순으로 정리
		//byte<short<int<long<float<double
		byte byteValue=10;
		int intValue=byteValue;
//		int i1="aa";
//		int i2=3.14;
		//정수 타입이 실수 타입으로 저장될 경우에는 무조건 자동 타입 변환이 된다
		long longValue=500000000000L;
		float floatValue=longValue;
		double doubleValue=longValue;
		
		//강제 타입 변환
		//강제 타입 변환은 캐스팅 연산자 괄호()를 사용
		int i3=10;
		byte b3=(byte)i3;
		int i4=1000;
		byte b4=(byte)i4;
		System.out.println(b4);
		//담을수 없는 크기의 값을 강제 변환하면 논리 에러가 발생된다.
		
		//
	}

}



