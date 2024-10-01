package c06;

public class MethodName {
	//메소드 이름
	//메소드 이름은 자바 식별자(변수이름,클래스이름) 규칙에 맞게 작성하면 됩니다.
	// - 숫자로 시작하면 안 되고, $와 _를 제외한 특수 문자를 사용이 안된다
	//관례적으로 메소드 이름은 소문자로 시작하여 작성합니다.
	//서로 다른 단어가 혼합된 이름이라면 뒤이어 오는 단어의 첫 글자는
	//대문자로 작성합니다.
	//클래스이름
	//MethodName, Car, MyCar, Ride, Const
	//변수 이름
	//number, result, sum, model, name, age, numArr
	//메소드 이름(동사로 시작)
	//run, startEngine, getName, getScores
	
	//매개 변수 선언
	//매개 변수는 메소드가 실행할 때 필요한 데이터를 외부로부터 받기 위해
	//사용됩니다.
	//메소드에서 매개 변수가 필요한 경우가 있고 필요 없는 경우가 있습니다.
	//메소드를 호출할 때에는 매개변수의 수와 타입을 잘 맞춰야 합니다.
	double divide(int x, int y) {
		double result=(double)x/y;
		return result;
	}
	
	int getPerfactNum() {
		return 42;
	}
	
	public static void main(String[] args) {
		MethodName mn=new MethodName();
		mn.divide(10, 3);
//		mn.divide(10.0, 3);//(X)
		//매개값은 반드시 매개 변수의 타입에 부합되는 값이어야 합니다.
		//divide()메소드가 int 타입 매개 변수를 가지고 있다면
		//호출 시 매개값으로 int값이나 int타입으로 변환될 수 있는 값을 
		//넘겨 주어야합니다.
		//변수를 활용
		int x=9;
		mn.divide(x, 8);
		//자동 형 변환 활용
		byte b1=10;
		byte b2=20;
		mn.divide(b1, b2);
		//메소드 활용
		mn.divide(mn.getPerfactNum(),3);
	}

}








