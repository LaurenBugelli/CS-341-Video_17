package bugelli;
/**
 * 
 *  @author Trish, covered by lauren
 *	Instantiate cake factory and cake store
 *	build one of each cake
 *	complete the order 
 */
public class AppDriver {
	public static void main(String[] args) {
		CakeFactory cakeFactory = new CakeFactory();
		CakeStore store = new CakeStore(cakeFactory);
		Cake cake1 = store.onlineOrder("lemon");
		Cake cake2 = store.onlineOrder("chocolate");
		Cake cake3 = store.onlineOrder("vanilla");

		System.out.println("Completed order: " + cake1.getName());
		System.out.println("Completed order: " + cake2.getName());
		System.out.println("Completed order: " + cake3.getName());

	}

}
