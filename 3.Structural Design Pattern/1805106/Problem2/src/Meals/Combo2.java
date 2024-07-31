package Meals;

import Addons.Appetizer.OnionRings;
import Addons.Drinks.Water;
import Burger.BurgerDecorator;
import Burger.VeggiBurger;

public class Combo2 extends BurgerDecorator{
    public Combo2(){
        super(new VeggiBurger());
        super.add(new OnionRings());
        super.add(new Water());
    }
    @Override
    public String prepareFood() {
        return super.prepareFood();
    }
    @Override
    public double price() {
        return super.price();
    }

}
