package c05;

public class C05_01_02 {

	public static void main(String[] args) {
		//new 연산자로 배열 생성
		int[] arr1=new int[3];
		for(int i=0;i<3;i++) {
			System.out.println("arr1["+i+"] :"+arr1[i]);
		}
		arr1[0]=10;
		arr1[1]=20;
		arr1[2]=30;
		for(int i=0;i<3;i++) {
			System.out.println("arr1["+i+"] :"+arr1[i]);
		}
	}

}
