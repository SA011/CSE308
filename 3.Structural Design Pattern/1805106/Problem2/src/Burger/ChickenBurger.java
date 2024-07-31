package Burger;

public class ChickenBurger implements Burger{

    @Override
    public String prepareFood() {
        return "Chicken Burger";
    }

    @Override
    public double price() {
        return 150.0;
    }
    
}
