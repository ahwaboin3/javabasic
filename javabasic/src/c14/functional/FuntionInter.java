package c14.functional;

import java.util.function.Function;

//Function<T,R> -> R apply(T t)
public class FuntionInter {
	public static void main(String[] args) {
		Function<String, Integer> f=s->s.length();
		System.out.println(f.apply("Robot"));
		System.out.println(f.apply("System"));
		//Function<T,R>을 구체화하고 다양한 한 인터페이스들이 있다
	}

}
