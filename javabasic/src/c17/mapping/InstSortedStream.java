package c17.mapping;

import java.util.stream.Stream;

//정렬
//sorted(Comparator c)
public class InstSortedStream {
	public static void main(String[] args) {
		//스트림 생성
		//of() - 스트림 생성에 필요한 데이터를 직접 전달
		//기본 정렬 순서는 문자는 사전 편찬 순, 숫자형은 오름 차순으로 정렬된다.
		//asc
		Stream.of("Box","Apple","Robot")
			.sorted()
			.forEach(s->System.out.println(s));
		//sorted() 매개변수에 람다식을 사용하여 정렬 순서를 만들 수 있다.
		Stream.of("Box","Apple","Rabbit")
			//문자열 길이의 오름차순으로 정렬
			.sorted((s1,s2)->s1.length()-s2.length())
			.forEach(s->System.out.print(s+"\t"));
	}

}
