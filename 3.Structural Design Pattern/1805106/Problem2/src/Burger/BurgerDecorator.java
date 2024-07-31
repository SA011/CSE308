package Burger;

import java.util.ArrayList;
import java.util.List;

import Addons.Addons;

public abstract class BurgerDecorator implements Burger {
    private Burger burger = null;
    private List<Addons> addons = null;
    protected BurgerDecorator(Burger burger){
        this.burger = burger;
        addons = new ArrayList<>();
    }

    protected void add(Addons addon){
        addons.add(addon);
    }
    @Override
    public String prepareFood() {
        StringBuilder str = new StringBuilder(burger.prepareFood());
        for(int i = 0; i < addons.size(); i++){
            if(i == 0)str.append(" with ");
            else if(i + 1 < addons.size())str.append(", ");
            else str.append(" and ");
            str.append(addons.get(i).prepareFood());
        }
        return str.toString();
    }

    @Override
    public double price() {
        double sum = burger.price();
        for(Addons a : addons)
            sum += a.price();
        return sum;
    }
}
