package Meals;

import Burger.BeefBurger;
import Burger.BurgerDecorator;

public class Combo5 extends BurgerDecorator{
    public Combo5(){
        super(new BeefBurger());
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
