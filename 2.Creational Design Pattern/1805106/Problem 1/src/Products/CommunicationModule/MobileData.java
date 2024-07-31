package Products.CommunicationModule;

public class MobileData implements Communication{

    @Override
    public String getName() {
        return "Sim Mobile Data Communication";
    }

    @Override
    public Double getCost() {
        return 300.0;
    }

    @Override
    public Double getYearlyCost() {
        return 200.0;
    }
    
}
