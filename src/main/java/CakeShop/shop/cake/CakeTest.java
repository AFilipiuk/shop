package CakeShop.shop.cake;

public class CakeTest {
	public static void main(String[] args) {
		Cake dekorowanyCake = new Cream(
                new Icing(new OrderedCake()));
		System.out.println(dekorowanyCake.GetData());
	}
}