package Burger;

public class BeefBurger implements Burger{

    @Override
    public String prepareFood() {
        return "Beef Burger";
    }

    @Override
    public double price() {
        return 180.0;
    }
    
}
