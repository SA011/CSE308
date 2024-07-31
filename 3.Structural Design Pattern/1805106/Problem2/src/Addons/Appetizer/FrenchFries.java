package Addons.Appetizer;

public class FrenchFries implements Appetizer{

    @Override
    public String prepareFood() {
        return "French Fries";
    }

    @Override
    public double price() {
        return 45.0;
    }
    
}
