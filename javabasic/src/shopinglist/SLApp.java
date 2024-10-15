package shopinglist;

public class SLApp {
	public static void main(String[] args) {
		SLRepo sRepo=new SLRepo();
		sRepo.addSL("샴푸");
		sRepo.addSL("바디워시");
		
		sRepo.printSLs(sls->System.out.println(sls));
		sRepo.printSLs(sls->{
			System.out.println("내일까지 꼭 사야 되는 물품");
			System.out.println("물품 :"+sls.get(0).getName());
			System.out.println("급하지 않은 물품");
			System.out.println("물품 :"+sls.get(1).getName());
		});
	}

}
