package Burger;

public class VeggiBurger implements Burger{

    @Override
    public String prepareFood() {
        return "Vegitable Burger";
    }

    @Override
    public double price() {
        return 120.0;
    }
    
}
