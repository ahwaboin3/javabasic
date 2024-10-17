package c17.mapping;

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
		
	}
}
