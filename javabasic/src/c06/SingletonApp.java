package c06;

public class SingletonApp {
	
	public static void main(String[] args) {
		//private으로 설정한 생성자는
		//외부에서 호출이 불가하다
//		Singleton singleton=new Singleton();//X
		Singleton s1=Singleton.getInstance();
		Singleton s2=Singleton.getInstance();
		System.out.println(s1);
		System.out.println(s2);
	}

}
