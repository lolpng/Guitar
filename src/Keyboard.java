
public class Keyboard extends Instrument {
	private int numOfKeys;
	
	public Keyboard(double price, int numOfKeys, String manifacturer) {
		super(price, manifacturer);
		this.numOfKeys = numOfKeys;
	}
}
