package c02;

public class C02_02_02 {
	
	public static void main(String[] args) {
		//char 타입
		//하나의 문자를 작은따옴표(')로 감싼 것을 문자 리터럴이라고 합니다.
		//문자 리터럴은 유니코드(unicode)로 변환되어 저장됩니다.
		//유니코드는 세계 각국의 문자를 2byte로 표현할 수 있는
		//숫자(0~65535)로 매핑한 국제 표준 규약입니다.
		char var1='A';
		char c=65;
		System.out.println(var1);
		System.out.println(c);
		//String 타입
		//자바에서 큰따옴표(")로 감싼 문자들은 문자열이라고 부릅니다.
		String str1="A";
		String str2="foo bar";
//		String str3='foo bar';
		//String타입은 기본 타입이 아닙니다. 
		//String은 클래스 타입입니다.
		
		//큰따옴표(")는 문자열 식별 기호인데, 
		//데이터로써 큰따옴표를 사용하고 싶은 경우
		//철수가 말했다. "안녕"
//		System.out.println("철수가 말했다. "안녕"");
		//문자열 내부에 역슬래스(\)가 붙은 문자를 사용할 수 있는데,
		//이것을 이스케이프(escape)문자라고 합니다.
		//이스케이프 문자를 사용하면 문자열 내부에 
		//특정 문자를 포함시킬수 있습니다.
		System.out.println("철수가 말했다. \"안녕\"");
		//탭만큼 띄우기 - \t
		System.out.println("id \t| name");
		System.out.println("1 \t| name");
		System.out.println("100 \t| name");
		//개행 하기 - \n
		System.out.println("홍길동\n김자바");
		System.out.println("역슬래시: \\");
		//역슬래시: \
	}

}



