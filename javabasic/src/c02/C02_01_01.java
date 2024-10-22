package c02;

//변수 선언
//변수를 사용하기 위해서는 먼저 변수를 선언해야 합니다.
//변수 선언은 변수에 어떤 타입(type)의 데이터를 저장할 것인지 그리고 변수 이름이 무엇인지를 결정합니다.
public class C02_01_01 {

	public static void main(String[] args) {
		//변수 선언은 다음과 같이 합니다
		//타입 + 변수 이름
		//정수(int)를 저장할 수 있는 age 변수 선언
		int age;
		//실수(double)를 저장할 수 있는 value 변수 선언
		double value;
		//같은 타입의 변수는 콤마(,)를 이용해서 한꺼번에 선언할 수도 있습니다.
		int a;
		int b;
		int c;
		int d,e,f;
		
		//변수 이름
		//변수 이름은 자바 언어에서 정한 명명 규칙을 따라야 하는데
		//이는 다음과 같습니다.
		
		//작성 규칙/예
		
		//첫 번째 글자는 문자이거나 '$','_'이어야 하고 
		//숫자로 시작할 수 있습니다
		//가능 : price, $price,_company, price1, p1p
		//불가능 : 1v, @speed, speed@, s@peed, $#value
		
		//영어 대소문자를 구분합니다
		//firstname과 firstName은 다른 변수
		String firstname="John";
//		System.out.println(firstName);
		
		//첫 문자는 영어 소문자로 시작하되, 
		//다른 단어가 붙을 경우 첫 문자를 대문자로 합니다(관례)
		//camel 표기법, 낙타 표기법
		//max+speed -> maxSpeed
		int maxSeed;
		//first+name -> firstName
		//car+body+color-> carBodyColor
		
		//문자 수(길이)의 제한은 없습니다.
		String whatKindDoYouLikeColorOfBlackAndWhiteFoodWar;
		//X
		
		//자바 예약어는 사용할 수 없습니다
//		int class;
//		int public;
		//예약어란 이미 해당 프로그래밍 언어에서 의미를 갖고 사용되고 있는 단어로
		//변수 이름으로 사용할 수 없습니다.
		
		//변수 이름
		//개발자는 변수가 어떤 값을 저장하고 있는지 쉽게 알 수 있도록
		//의미 있는 이름을 지어주는 것이 좋습니다.
		//변수 이름에는 한글을 포함하지 않습니다.(관례)
//		int 원의둘레;(X)
		
		int n1;
		int n2;
		
//		int age;
		//잔고의 의미를 갖는 변수 이름
		int balance;
		int withdraw;
		int deposit;
		
		//값 저장
		//변수에 값을 저장할 때에는 대입 연산자(=)를 사용합니다.
		//수학에서 등호(=)는 '같다'는 의미지만,
		//자바 언어에서는 오른쪽의 값을 왼쪽의 변수에 저장한다는 의미를 갖습니다.
		
		//변수 선언
		int score;
		//값 저장
		score=90;
		score=30;
		score=10;
		
		System.out.println(score);
		
		//자바에서는 변수에 값이 저장되지 않으면 변수가 생성되지 않습니다.
		int avr;
//		avr=0;
//		System.out.println(avr);
		//선언과 생성은 다른 이야기입니다.
		//변수 선언 저장되는 값의 종류와 이름만 언급한 것입니다.
		//변수에 최초로 값이 저장될 때 변수가 생성됩니다.
		//이것을 변수 초기화하고 합니다.
		//그리고 이때 사용된 값을 초기값이라고 합니다.
		//위 코드에서는 90이 초기값에 해당합니다.
		
		//초기값은 다음과 같이 변수를 선언함과 동시에 제공할 수 있습니다.
		int speed=90;
		
		//변수 사용
		//변수는 출력문이나 연산식 내부에서 변수에 저장된 값을 
		//출력하거나 연산할 때 사용합니다.
		
		int hour=3;
		int minute=5;
		
		System.out.println(hour+"시간 "+minute+"분");
		
		int totalMinute=hour*60+minute;
		System.out.println("총 "+totalMinute+"분");
	}

}



