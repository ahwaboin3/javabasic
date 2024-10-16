package c15;

import java.util.function.ToIntBiFunction;

//3. 클래스 이름을 통한 인스턴스 메소드 참조
public class IBox {
	private int n;
	public IBox(int i) {
		n=i;
	}
	public int larger(IBox b) {
		if(n>b.n) 
			return n;
		else
			return b.n;
	}
	public static void main(String[] args) {
		IBox ib1=new IBox(5);
		IBox ib2=new IBox(7);
		
		//두 상자에 저장된 값 비교하여 더 큰 값 반환
//		ToIntBiFunction<IBox,IBox> bf=(b1,b2)->b1.larger(ib2);
		//매개변수와 리턴이 유추가 가능한 상황에서 줄인 표현을 쓸수 있다
		//클래스이름::메소드이름 -> 메소드 참조
		ToIntBiFunction<IBox,IBox> bf=IBox::larger;
		int bigNum=bf.applyAsInt(ib1, ib2);
		System.out.println(bigNum);
	}
}







