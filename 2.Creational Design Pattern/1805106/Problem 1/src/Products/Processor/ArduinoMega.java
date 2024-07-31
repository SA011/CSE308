package Products.Processor;

public class ArduinoMega implements Processor {

    @Override
    public String getName() {
        return "Arduino Mega Microcontroller";
    }

    @Override
    public Double getCost() {
        return 1_500.0;
    }
    
}
