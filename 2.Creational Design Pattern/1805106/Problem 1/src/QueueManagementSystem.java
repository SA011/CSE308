import java.util.ArrayList;
import java.util.List;

import Products.Product;
import Products.CommunicationModule.Communication;

public class QueueManagementSystem {
    private List<Product> products = null;
    
    private Double getTotalCost(){
        if(products == null)return 0.0;
        Double ans = 0.0;
        for(Product p : products){
            ans += p.getCost();
            if(p instanceof Communication){
                ans += ((Communication)p).getYearlyCost();
            }
        }
        return ans;
    }
    public QueueManagementSystem(){
        products = new ArrayList<>();
    }

    public void addProduct(Product p){
        if(p == null)return;
        products.add(p);
    }

    public void printSystem(){
        if(products == null){
            System.out.println("No product has been considered yet");
            System.out.println("Total Cost: 0.0");
        }

        System.out.println("Components of queue management system:");
        for(Product p : products){
            System.out.println(p.getName());
        }

        System.out.println("Total Cost: " + getTotalCost());
    }
}
