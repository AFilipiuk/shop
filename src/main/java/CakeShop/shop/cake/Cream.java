package CakeShop.shop.cake;

public class Cream extends CakeDekorator{
public Cream (Cake dekorowanyCake){
super(dekorowanyCake);
}
public String GetData() {
    return dekorowanyCake.GetData() + " i z kremem...";
}
}