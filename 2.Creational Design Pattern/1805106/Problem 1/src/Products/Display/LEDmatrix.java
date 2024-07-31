package Products.Display;

public class LEDmatrix implements Display {

    @Override
    public String getName() {
        return "LED Matrix";
    }

    @Override
    public Double getCost() {
        return 15_000.0;
    }
    
}
