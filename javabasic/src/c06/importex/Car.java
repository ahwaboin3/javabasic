package c06.importex;

import java.util.Scanner;

//import c06.com.hankook.*;
// * - all, 모든 것
//*를 이용해서 해당 패키지에 소속된 모든 클래스를 포함(import)시킨다
//안쓰는 클래스도 포함 되기 때문에 성능 이슈로 인해
//일반적으로는 개별로 임포트해서 쓴다.

//import문
//사용하고자 하는 클래스 또는 인터페이스가 다른 패키지에 소속되어 있다면
//import문으로 해당 패키지의 클래스 또는 인터페이스를 가져와 사용할 것임을
//컴파일러에게 알려줘야 합니다.
import c06.com.hankook.BroadTire;
import c06.com.hankook.Tire;
public class Car {
	Tire tire=new Tire();
	c06.com.kumho.Tire kTire=new c06.com.kumho.Tire();
	//경우에 따라서는 import문과 상관없이 패키지가 포함된 클래스 전체 이름을
	//코드에 기술해야 할 때가 있습니다.
	//패키지 이름은 다르나 클래스 이름이 같은 경우나
	//임포트 문 없이 다른 패키지의 클래스를 바로 사용해야 할 경우
	//패키지 이름과 클래스 이름 전체를 적어 주면 됩니다.
	
	BroadTire broadTire=new BroadTire();
	Scanner sc=new Scanner(System.in);
	
	public static void main(String[] args) {
		System.out.println();
		Math.random();
	}

}
