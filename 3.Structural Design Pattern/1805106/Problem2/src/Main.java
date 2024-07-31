import java.util.Scanner;

import Burger.Burger;
import Meals.MealFactory;

public class Main {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);

        MealFactory shop = new MealFactory();
        while(true){
            System.out.println("MENU: ");
            System.out.println("1. Beef burger with French fry and cheese");
            System.out.println("2. Veggi Pizza with onion rings and Bottle of Water");
            System.out.println("3. A combo meal with Veggi burger, French Fry and Coke");
            System.out.println("4. A combo meal with Veggi burger, Onion Rings, Coffee and Water");
            System.out.println("5. A Beef burger only");
            System.out.println("6. EXIT");
            Burger b = shop.getMeal(sc.nextInt());
            try{
                System.out.println(b.prepareFood());
                System.out.println("Price: " + b.price());
            }catch(NullPointerException e){
                break;
            }
        }
        sc.close();
    }
}