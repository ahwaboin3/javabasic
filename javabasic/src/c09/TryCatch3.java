package c09;

import java.util.Scanner;

public class TryCatch3 {
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.println("메뉴 선택 (정수): ");
		int choice=s.nextInt();
		System.out.println("당신이 선택한 번호는 "+choice+"입니다.");
	}
}
