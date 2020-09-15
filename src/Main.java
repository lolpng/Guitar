
public class Main {

	public static void main(String[] args) {
		GuitarShop shop = new GuitarShop();
		shop.buyGuitar(new Guitar(150.99, GuitarType.electric, "Gibson"));
		shop.buyGuitar(new Guitar(500.99, GuitarType.classic, "Gibson"));
		shop.buyGuitar(new Guitar(420.99, GuitarType.acustic, "Gibson"));
		shop.buyGuitar(new Guitar(1000.99, GuitarType.electric, "Gibson"));
		shop.buyGuitar(new Guitar(200.99, GuitarType.acustic, "Gibson"));
		shop.buyGuitar(new Guitar(5.99, GuitarType.classic, "Gibson"));
		shop.buyGuitar(new Guitar(460.99, GuitarType.electric, "Gibson"));
		shop.buyGuitar(new Guitar(9999.99, GuitarType.acustic, "Gibson"));
		shop.buyGuitar(new Guitar(350.99, GuitarType.electric, "Gibson"));
		shop.buyGuitar(new Guitar(30.99, GuitarType.classic, "Gibson"));
		shop.buyGuitar(new Guitar(230.99, GuitarType.electric, "Gibson"));
		shop.buyGuitar(new Guitar(540.99, GuitarType.acustic, "Gibson"));
		shop.buyGuitar(new Guitar(510.99, GuitarType.electric, "Gibson"));
		shop.buyGuitar(new Guitar(470.99, GuitarType.classic, "Gibson"));
		shop.buyGuitar(new Guitar(9000.99, GuitarType.electric, "Gibson"));
		shop.buyGuitar(new Guitar(700.99, GuitarType.acustic, "Gibson"));
		shop.buyGuitar(new Guitar(4500.99, GuitarType.classic, "Gibson"));
		shop.buyGuitar(new Guitar(930.99, GuitarType.electric, "Gibson"));
		shop.sellGuitar(GuitarType.classic, 10);
		System.out.println(shop.totalGuitars());
		
		

	}

}
