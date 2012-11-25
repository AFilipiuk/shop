package CakeShop.shop.cake;

public class Icing extends CakeDekorator{
public Icing (Cake dekorowanyCake){
super(dekorowanyCake);
}
public String GetData() {
    return dekorowanyCake.GetData() + ", z polewą";
}
}