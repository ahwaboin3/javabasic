package c15;

import java.util.function.Function;

//4.생성자 참조
public class StringMaker {
	public static void main(String[] args) {
		Function<char[],String> f= ar->{
			return new String(ar);
		};
		Function<char[],String> f1= ar->new String(ar);
		//람다식을 작성 시 인스턴스 생성 후 이의 참조 값을 반환하는 경우가 있다.
		//이 경우 메소드 참조 방식을 쓸 수 있음.
		Function<char[],String> f2= String::new;
		
		//클래스->클래스 상속->인터페이스->익명 클래스->람다->메소드 참조
		char[] src= {'R','o','b','o','t'};
		String str=f.apply(src);
		System.out.println(str);
	}

}




