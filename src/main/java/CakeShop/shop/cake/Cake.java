package CakeShop.shop.cake;

interface Cake{
	public String GetData(); // zwraca opis
}
//implementacja zamowione ciasto bez dekoratorów
class OrderedCake implements Cake {
	public String GetData(){
	return "Zamówione ciasto";
}



}
