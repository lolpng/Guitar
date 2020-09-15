
public class Instrument {
	private double price;
	private String manifacturer;
	private int serialNum;
	private static int counter = 1000;
	
	public Instrument(double price, String manifacturer) {
		this.price = price;
		this.manifacturer = manifacturer;
		serialNum = counter;
		counter++;
	}

	public Instrument() {
		serialNum = counter;
	}

	public double getPrice() {
		return price;
	}
	
	public int getCounter() {
		return counter;
	}
	
}
