package Meals;

import Addons.Cheese;
import Addons.Appetizer.FrenchFries;
import Burger.BeefBurger;
import Burger.BurgerDecorator;

public class Combo1 extends BurgerDecorator{
    public Combo1(){
        super(new BeefBurger());
        super.add(new FrenchFries());
        super.add(new Cheese());
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
