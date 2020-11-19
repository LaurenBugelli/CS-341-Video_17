package bugelli;
/**
 * 
 *  @author Trish, covered by lauren
 *	return type of cake, construct cake 
 */
public class CakeFactory {
	/**
	 * 
	 * @param type String type of cake in the order
	 * @return Cake Object NOT the base cake but a flavored one
	 */
	public Cake orderCake(String type) {
		if (type.equals("vanilla")) {
			return new VanillaCake();
		}else if(type.equals("chocolate")){
			return new ChocolateCake();
		}else {
			return new LemonCake();
		}
	}

}
