package c17.mapping;

import java.util.ArrayList;
import java.util.List;

//장난감 모델 별 가격 정보
public class ToyPriceInfo {
	private String model;//모델 명
	private int price;//가격
	public ToyPriceInfo(String model, int price) {
		this.model = model;
		this.price = price;
	}
	public String getModel() {
		return model;
	}
	public int getPrice() {
		return price;
	}
	
	public static void main(String[] args) {
		List<ToyPriceInfo> ls=new ArrayList<>();
		ls.add(new ToyPriceInfo("GUN_LR_45", 200));
		ls.add(new ToyPriceInfo("TEDDY_BEAR_S_014", 350));
		ls.add(new ToyPriceInfo("CAR_TRANSFORM_VER_7719", 550));
		
		//500원 이상의 장난감만 분류하고 총 가격을 구하시오.
		int sum=ls.stream()
				.filter(p->p.getPrice()>500)
				.mapToInt(t->t.getPrice())
				.sum();
		System.out.println("sum= "+sum);
		
	}
}








