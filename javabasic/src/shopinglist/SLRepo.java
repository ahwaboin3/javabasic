package shopinglist;

import java.util.ArrayList;
import java.util.List;

public class SLRepo {
	List<ShoppingList> SLs=new ArrayList<>();
	
	public void printSLs(PrintSLs psls) {
		psls.printSLs(SLs);
	}
	
	public void addSL(String name) {
		ShoppingList sl=new ShoppingList();
		sl.setName(name);
		SLs.add(sl);
	}

}
