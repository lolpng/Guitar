
public class Guitar extends Instrument{
	private GuitarType type;

	
	public Guitar(double price, GuitarType type, String manifacturer){
		super(price, manifacturer);
		this.type = type;
	}
	
	public Guitar() {
		super();
	}

	public GuitarType getType() {
		return type;
	}

	
}
