package Meals;

import Burger.Burger;

public class MealFactory {
    public Burger getMeal(int combo){
        switch(combo){
            case 1:
                return new Combo1();
            case 2:
                return new Combo2();
            case 3:
                return new Combo3();
            case 4:
                return new Combo4();
            case 5:
                return new Combo5();
            default:
                return null;
        }
    }
}
