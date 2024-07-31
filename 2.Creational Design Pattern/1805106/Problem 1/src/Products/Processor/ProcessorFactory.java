package Products.Processor;

public class ProcessorFactory{
    public static Processor createProcessor(String type){
        if(type == null)return null;
        if(type.equalsIgnoreCase("ATMega32"))
            return new ATMega32();
        
        if(type.equalsIgnoreCase("Arduino Mega"))
            return new ArduinoMega();
        
        if(type.equalsIgnoreCase("RaspberryPi"))
            return new RaspberryPi();
        return null;
    }
}
