
public class Drum extends Instrument{
	private int numInSet;
	
	public Drum(double price, int numInsSet, String manifacturer) {
		super(price, manifacturer);
		this.numInSet = numInSet;
	}
	
	public Drum() {
		super();
	}
}
