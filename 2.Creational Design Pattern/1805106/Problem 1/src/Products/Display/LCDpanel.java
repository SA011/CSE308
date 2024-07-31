package Products.Display;

public class LCDpanel implements Display {

    @Override
    public String getName() {
        return "LCD Panel";
    }

    @Override
    public Double getCost() {
        return 12_000.0;
    }
    
}
