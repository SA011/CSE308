package Addons.Drinks;

public class Coke implements Drinks{

    @Override
    public String prepareFood() {
        return "Coke";
    }

    @Override
    public double price() {
        return 20.0;
    }
    
}
