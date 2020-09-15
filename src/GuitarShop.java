
public class GuitarShop {
	private Guitar guitars[];
	private static int stock = 0;
	
	public GuitarShop() {
		this.guitars = new Guitar[100];
	}
	
	public void buyGuitar(Guitar guitar) {
		for(int i = 0; i < guitars.length; i++) {
			if(guitars[i] == null) {
				guitars[i] = guitar;
				stock++;
				break;
			}
		}
	}
	
	public void sellGuitar(GuitarType type, double price) {
		if(stock >= 5) {
			for(int i = 0; i < guitars.length; i++) {
				if(guitars[i].getType() == type && guitars[i].getPrice() < price) {
					guitars[i] = null;
					stock--;
					break;
				}
			}
		}
	}
	
	public int totalGuitars() {
		Guitar temp = new Guitar();
		return temp.getCounter() - 1000;
	}
}
