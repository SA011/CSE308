package Meals;

import Addons.Appetizer.FrenchFries;
import Addons.Drinks.Coke;
import Burger.BurgerDecorator;
import Burger.VeggiBurger;

public class Combo3 extends BurgerDecorator{
    public Combo3(){
        super(new VeggiBurger());
        super.add(new FrenchFries());
        super.add(new Coke());
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
