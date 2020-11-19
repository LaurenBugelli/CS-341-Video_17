package bugelli;
/**
 * 
 *  @author Trish, covered by lauren
 *	 Two processes
 *		order specific type of cake
 *		prepare cake
 */

public class CakeStore {
	private CakeFactory cakeFactory;
	/**
	 * 
	 * @param cakeFactory Object
	 */
	public CakeStore (CakeFactory cakeFactory) {
		this.cakeFactory = cakeFactory;
	}
	/**
	 * 
	 * @param type String type of cake ordered
	 * @return cake Object completed cake order
	 */
	public Cake onlineOrder (String type) {
		//PROCESS 1: COMPLETE THE ONLINE ORDER
		Cake cake = cakeFactory.orderCake(type);
		
		//PROCESS 2: COMPLETE THE CAKE ORDER
		cake.prepare();
		cake.bake();
		cake.box();
		
		return cake;
	}

}
