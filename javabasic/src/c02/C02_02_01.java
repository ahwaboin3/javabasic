package c02;

//파이썬
//x=0
//자바스크립트
//let x=0
//const y=1
public class C02_02_01 {
	//기본 타입
	//변수를 선언할 때 주어지는 타입에 따라 변수에 저장할 수 있는
	//값의 종류와 허용 범위가 달라집니다.
	//변수를 선언한 후에는 타입을 변경할 수 없기 때문에
	//변수를 선언할 때 어떤 타입을 사용할지 충분히 고려해야 합니다.
	
	//구분/저장되는 값에 따른 분류/타입의 종류
	//기본타입/정수 타입/byte, char, short, int, long
	//기본타입/실수 타입/float, double
	//기본타입/논리 타입/boolean
	
	//정수 타입
	//타입|메모리 사용 크기| 1byte==8bit
	//byte|1byte|8bit|-128~127
	//short|2byte|16bit
	//char|2byte
	//int|4byte
	//long|8byte
	public static void main(String[] args) {
		int varName;
		String strName="string";
		byte b;char c;short s; int i;long l;
		byte b1=127;
//		byte b2=128;
		byte b3=-128;
		//정수 타입으로 선언된 변수에는 정수 리터럴을 대입해서
		//정수를 저장할 수 있습니다.
		//소스 코드에서 프로그래머에 의해 직접 입력된 값을 리터럴(literal)
		//이라고 부릅니다.
		
		//입력된 리터럴 중에서 자바가 정수로 인식하는 경우
		//10진수:소수점이 없는 0~9숫자로 구성됩니다.
		int decimal=12;
		decimal=365;
		//2진수:0b또는 0B로 시작하고 0과 1로 구성됩니다
		int binary=0b1011;
		System.out.println(binary);
		//8진수:0으로 시작하고 0~7숫자로 구성됩니다.
		int octal=013;
//		int phoneNumber=01012345678;
		//16진수:0x또는 0X로 시작하고 0~9숫자와 A,B,C,D,E,F
		//또는 a,b,c,d,e,f로 구성됩니다.
		int hexadecimal=0xB3;
		hexadecimal=0x2A0F;
		
		//기본적으로 컴파일러는 정수 리터럴을 int 타입으로 간주합니다.
//		System.out.println(21000000000);
		//리터럴이 long 타입임을 컴파일러에게 알려주어야합니다
		//정수 리터럴 뒤에 소문자 l이나 대문자 L을 붙이면 됩니다
//		long balance=21000000000;
		long balance1=21000000000l;
		long balance2=21000000000L;
		//long타입 변수에 정수 리터럴을 저장할 때 
		//int 타입의 허용 범위 이내라면 L을 붙이지 않아도 됩니다.
		long balance3=210;
	}

}
