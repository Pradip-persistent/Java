
public class ProductNames {
	public static void main(String[] argc) {
		String [] productNames=initProductNames();
		boolean ans=isPresent(productNames, "ttle");
		if(ans) {
			System.out.println("Present");
		}
		else {
			System.out.println("absent");
		}
	}
	static String[] initProductNames() {
	String[] productNames= {"Bottle","Pen","pencil","Drum"};
	return productNames;
	}

	static boolean isPresent(String[] productNames, String keyword) {
		for(String product: productNames) {
			if(product.indexOf(keyword)!=-1) {
				return true;
			}
		}
		return false;
	}
}
