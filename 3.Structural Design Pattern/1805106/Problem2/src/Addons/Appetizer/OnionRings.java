package Addons.Appetizer;

public class OnionRings implements Appetizer{

    @Override
    public String prepareFood() {
        return "Onion Rings";
    }

    @Override
    public double price() {
        return 60.0;
    }
    
}
