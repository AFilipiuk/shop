package CakeShop.shop.cake;

public class Base extends CakeDekorator{
public Base (Cake dekorowanyCake){
super(dekorowanyCake);
}
public String GetData() {
    return dekorowanyCake.GetData() + " na biszkopcie ";
}
}