package Products.CommunicationModule;

public class Wifi implements Communication{

    @Override
    public String getName() {
        return "Wifi Communication";
    }

    @Override
    public Double getCost() {
        return 3_200.0;
    }

    @Override
    public Double getYearlyCost() {
        return 500.0;
    }
    
}
