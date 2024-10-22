package c12.stringio;

import java.io.FileWriter;
import java.io.IOException;
import java.io.Writer;

//문자 출력 스트림:Writer
//Writer는 문자 기반 출력 스트림의 최상위클래스로 추상 클래스입니다.
//모든 문자 기반 출력 스트림 클래스는 Wriiter클래스를 상속받아서 만들어집니다.
//FileWriter,BufferedWriter,PrintWriter,OutputStreamWriter
//이 클래스들은 모두 Writer클래스를 상속하고 있습니다.
//Writer클래스의 주요 메소드
//리턴 타입 | 메소드 | 설명
//void | write(char c) | 매개값으로 주어진 한 문자를 보냅니다.
//void | write(char[] cbuf)| 매개값으로 주어진 배열의 모든 문자를 보냅니다.
//void | write(char[] cbuf,int off,int len) | 매개값으로 주어진 배열에서
//cbuf[off]부터 len개까지의 문자를 보냅니다.
//void | write(String str) | 매개값으로 주어진 문자열을 보냅니다.
//void | flush() | 버퍼에 잔류하는 모든 문자를 출력합니다.
//void | close() | 출력 스트림을 닫습니다.
public class WriteExample {
	public static void main(String[] args) {
		//write(String str)메소드
		//문자열 출력하기
		try {
			Writer writer=new FileWriter("C:/Temp/test10.txt");
			String str="I like Java";
			writer.write(str);
			writer.flush();
			writer.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

}




