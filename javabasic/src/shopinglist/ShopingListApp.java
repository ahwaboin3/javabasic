package shopinglist;

import java.util.Scanner;

public class ShopingListApp {
	
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		ShoppingListRepository slr=new ShoppingListRepository();
		while(true) {
			System.out.println("0.종료 1. 물품 등록 2. 물품 보기");
			System.out.println("선택: ");
			int choice =sc.nextInt();
			sc.nextLine();
			switch (choice){
			case 0:
				return;
			case 1:
				slr.createSL(null);
			}
		}
	}

}
