package Addons.Drinks;

public class Water implements Drinks{

    @Override
    public String prepareFood() {
        return "Water";
    }

    @Override
    public double price() {
        return 15.0;
    }
    
}
