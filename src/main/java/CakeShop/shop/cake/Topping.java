package CakeShop.shop.cake;

public class Topping extends CakeDekorator{
public Topping (Cake dekorowanyCake){
super(dekorowanyCake);
}
public String GetData() {
    return dekorowanyCake.GetData() + " i z posypką, ";
}
}