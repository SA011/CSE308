package Products.CommunicationModule;

public class Broadband implements Communication{

    @Override
    public String getName() {
        return "Broadband Communication";
    }

    @Override
    public Double getCost() {
        return 2_000.0;
    }

    @Override
    public Double getYearlyCost() {
        return 800.0;
    }
    
}
