package c06;

//싱글톤
//가끔 전체 프로그램에서 단 하나의 객체만 만들도록 보장해야 하는 경우가 있습니다.
//단 하나만 생성된다고 해서 이 객체를 싱글톤(singleton)이라고 합니다.
//싱글톤을 만들려면 클래스 외부에서 new연산자로 생성자를 호출할 수 없도록
//막아야 합니다.
//생성자를 호출한 만큼 객체가 생성되기 때문입니다.
public class Singleton {
	
	//생성자를 외부에서 호출할 수 없도록 하려면
	//생성자 앞에  private 접근 제한자를 붙여주면됩니다.
	//접근 제한자는 나중에 자세히 설명하기로 하고,
	//여기서는 외부에서 생성자 호출을 막기 위해 private를 붙여준다는 것만
	//알아 두세요.
	
	//자신의 타입인 정적 필드를 하나 선언하고 자신의 객체를
	//생성해 초기화합니다.
	//참고로 클래스 내부에서는 private붙은 필드와 메소드가 사용 가능 하다
	private static Singleton singleton=new Singleton();
	
	private Singleton() {
	}
	
	//외부에서 호출할 수 있는 정적 메소드를 선언하고 정적 필드에서
	//참조하고 있는 자신의 객체를 리턴해줍니다.
	static Singleton getInstance() {
		return singleton;
	}
}