package CakeShop.shop.cake;

public class Inscription extends CakeDekorator{
public Inscription (Cake dekorowanyCake){
super(dekorowanyCake);
}
public String GetData() {
    return dekorowanyCake.GetData() + " z napisem, ";
}
}