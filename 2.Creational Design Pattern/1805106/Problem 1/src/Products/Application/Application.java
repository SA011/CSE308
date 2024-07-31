package Products.Application;

import Products.Product;

public class Application implements Product {

    @Override
    public String getName() {
        return "Controller Application";
    }

    @Override
    public Double getCost() {
        return 21_000.0;
    }
    
}
