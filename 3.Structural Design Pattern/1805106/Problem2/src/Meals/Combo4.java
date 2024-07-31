package Meals;

import Addons.Appetizer.OnionRings;
import Addons.Drinks.Coffee;
import Addons.Drinks.Water;
import Burger.BurgerDecorator;
import Burger.VeggiBurger;

public class Combo4 extends BurgerDecorator{
    public Combo4(){
        super(new VeggiBurger());
        super.add(new OnionRings());
        super.add(new Coffee());
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
