package class_06;
public class ShopService {	//ex18
	//작성 위치
	private static ShopService instance = new ShopService();
	
	private ShopService() {}
	
	static ShopService getInstance() {
		return instance;
	}
}
