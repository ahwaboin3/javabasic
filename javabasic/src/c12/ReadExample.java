package c12;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.InputStream;

public class ReadExample {
	public static void main(String[] args) {
		//바이트 입력 스트림:InputStream
		//InputSteam은 바이트 기반 입력 스트림의 최상위 클래스로 추상클래스입니다
		//모든 바이트 기반 입력 스틀미은 InputStream클래스를 상속받아서
		//만들어 집니다
		//InputStream클래스를 상속하는 클래스
		//FileInputStream, BufferedInputStream, DataInputStream
		
		//InputStream클래스의 주요 메소드
		//리턴 타입 | 메소드 | 설명
		//int | read() | 1byte를 읽고 읽은 바이트를 리턴합니다.
		//int | read(byte[] b) |읽은 바이트를 매개값으로 주어진 배열에
		//저장하고 읽은 바이트 수를 리턴합니다.
		//int | read(byte[] b, int off, int len) | len개의 바이트를
		//읽고 매개값으로 주어진 배열에서 b[off]부터 len개까지 저장합니다.
		//그리고 읽은 바이트 수를 리턴합니다.
		//void | close() | 입력 스트림을 닫습니다.
		try {
			InputStream is=new FileInputStream("C:/Temp/test1.db");
			//더이상 입력 스트림으로부터 바이트를 읽을 수 없다면 read()메소드는
			//-1을 리턴합니다
			while(true) {
				int data=is.read();
				if(data==-1) break;
				System.out.println(data);
			}
			is.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		//read(byte[] b)메소드
		//입력 스트림으로부터 매개값으로 주어진 배열의 길이 만큼 바이트를 읽고
		//해당 배열에 저장합니다. 그리고 읽은 바이트 수를 리턴합니다.
		try {
			InputStream is=new FileInputStream("C:/Temp/test2.db");
			byte[] iputArr=new byte[100];
			while(true) {
				int readedNum=is.read(iputArr);
				if(readedNum==-1) break;
				for(int i=0;i<readedNum;i++) {
					System.out.println(iputArr[i]);
				}
			}
			is.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}





