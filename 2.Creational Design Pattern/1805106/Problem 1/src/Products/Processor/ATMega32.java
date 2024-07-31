package Products.Processor;

public class ATMega32 implements Processor {

    @Override
    public String getName() {
        return "ATMega32 Microcontroller";
    }

    @Override
    public Double getCost() {
        return 400.0;
    }
    
}
