package c10;

public class SmartPhone {
	private String company;
	private String os;
	
	public SmartPhone(String company, String os) {
		super();
		this.company = company;
		this.os = os;
	}

	@Override
	public String toString() {
		return "SmartPhone [company=" + company 
				+ ", os=" + os + "]";
	}
	
//	@Override
//	public String toString() {
//		return "SmartPhone -> company: "+company+" os :"+ os;
//	}
	public static void main(String[] args) {
		SmartPhone sp=new SmartPhone("샘송", "안드로이드15");
		System.out.println(sp);
	}
}
