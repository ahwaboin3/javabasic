package c03;

public class C03_01_04 {

	public static void main(String[] args) {
		//논리 연산자
		int num1=42;
		System.out.println(num1>10&&num1<50);
		//논리곱(and) - &&, & - ~와
		//연산식 | 결과
		//true && true | true
		//true && false | false
		//false && true | false
		//false && false | false
		//피연산자 모두가 true일 경우에만 연산 결과가 true
		
		//논리합(OR) - ||, | - ~또는
		//연산식 | 결과
		//true || true => true
		//true || false => true
		//false || true => true
		//false || false => false
		//피연산자 중 하나만 true이면 연산 결과는 true
		
		//논리 부정(not) - ! - 피연산자의 논리값을 바꿈
		
		//&&와 &는 산출 결과는 같지만 연산 과정이 조금 다릅니다.
		//&&는 앞의 피연산자가 false라면 뒤의 피연산자를 평가하지 않고
		//바로 false라는 산출 결과를 냅니다.
		//그러나 &는 두 피연산자 모두를 평가해서 산출 결과물을 냅니다.
		//||와 |도 마찬가지입니다.
		
		//10보다 크거나 20보다 작다
		int num2=15;
		System.out.println(num2>10&&num2<20);
		boolean b1=num2>10&&num2<20;
		System.out.println(b1);
		
		//20보다 크거나 30보다 작다
		int num3=40;
		System.out.println(num3>20&&num3<30);
		System.out.println((num3>20)&&(num3<30));
		
		//2 또는 3의 배수 인가?
		int num4=6;
		// true면 2의 배수, false 2의 배수가 아니다
		System.out.println(num4%2==0);
		//3의 배수인가
		System.out.println(num4%3==0);
		
		//2 또는 3의 배수인가?
		System.out.println(num4%2==0||num4%3==0);
		System.out.println((num4%2==0)||(num4%3==0));
		System.out.println(!(num4%2==0||num4%3==0));
		
		//대입 연산자
		// = -> 단순 대입 연산자
		//오른쪽 피연산자의 값을 왼쪽 피연산자의 변수에 저장합니다.
		
		//복합 대입 연산자 
		//-> 정해진 연산을 수행한 후 결과를 변수에 저장하는 연산자입니다.
		int num5 =42;
		num5+=1;
		//num5=num5+1
		System.out.println(num5);
		num5+=10;
		//num5=num5+10
		System.out.println(num5);
		// +=, -=, *=, /=, %=
		//대입 연산자는 모든 연산자들 중에서 가장 낮은 연산 순위를 가지고 있다
		
		
		
	}

}
