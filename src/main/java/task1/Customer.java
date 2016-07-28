package task1;

import task1.kitchen.*;

import java.io.IOException;

/**
 * Created by user on 27.07.2016.
 */
public class Customer {
    public static void main(String[] args) throws IOException {
        ConsoleHelpers conHel = new ConsoleHelpers();

        Restaurant customer1 = new PolishDish("Henk");
        customer1.lanch(conHel.getAllDishes());
        customer1.drink(conHel.getAllDrinks(), conHel.drinkWant());

        Restaurant customer2 = new ItalianDish("Tom");
        customer2.lanch(conHel.getAllDishes());
        customer2.drink(conHel.getAllDrinks(), conHel.drinkWant());

        Restaurant customer3 = new MexicanDish("Jak");
        customer3.lanch(conHel.getAllDishes());
        customer3.drink(conHel.getAllDrinks(), conHel.drinkWant());
    }
}
