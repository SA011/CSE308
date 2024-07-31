package Addons.Drinks;

public class Coffee implements Drinks{

    @Override
    public String prepareFood() {
        return "Coffee";
    }

    @Override
    public double price() {
        return 25.0;
    }
    
}
