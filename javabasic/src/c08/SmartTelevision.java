package c08;

//다중 인터페이스 구현 클래스
//implements 인터페이스A, 인터페이스B
public class SmartTelevision 
	implements RemoteControl, Searchable{

	@Override
	public void turnOn() {
	}

	@Override
	public void turnOff() {
	}

	@Override
	public void setVolume(int volume) {
	}

	@Override
	public void search(String url) {
		
	}
	
	public static void main(String[] args) {
		//두개의 인터페이스를 모두 구현하고 있기 때문에
		//두개의 인터페이스 타입 변수에 각각 대입할 수 있습니다.
		RemoteControl rc=new SmartTelevision();
		Searchable s=new SmartTelevision();
		SmartTelevision st=new SmartTelevision();
		RemoteControl rc1=st;
		Searchable s1=st;
		
	}

}






