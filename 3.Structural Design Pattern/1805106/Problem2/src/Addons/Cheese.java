package Addons;

public class Cheese implements Addons{

    @Override
    public String prepareFood() {
        return "Cheese";
    }

    @Override
    public double price() {
        return 30.0;
    }
    
}
