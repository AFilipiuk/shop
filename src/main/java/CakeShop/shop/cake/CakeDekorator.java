package CakeShop.shop.cake;

//abstrakcyjna klasa dekorator - implementuje interfejs
abstract class CakeDekorator implements Cake {
protected Cake dekorowanyCake;  //dekorowane ciasto

public CakeDekorator( Cake dekorowanyCake) {
	this.dekorowanyCake = dekorowanyCake;
}
}