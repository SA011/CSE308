package Products.Processor;

public class RaspberryPi implements Processor {

    @Override
    public String getName() {
        return "Raspberry Pi";
    }

    @Override
    public Double getCost() {
        return 3_000.0;
    }
    
}
