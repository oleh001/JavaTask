package task1.kitchen;

/**
 * Created by user on 27.07.2016.
 */
public abstract class similarKitchen {
    String name;
    Dishes lanche;
    Drinks drinke;
    boolean cubes;
    boolean lemon;

    public similarKitchen(String name) {
        this.name = name;
    }

    void lanch(Dishes dish) {
        if (dish == null) {
            System.out.println("No Dishes");
            lanche = null;
        } else {
            lanche = dish;
        }
    }

    void drink(Drinks drink, String[] cubeLemon) {
        if (drink == null) {
            System.out.println("No Drinks");
            drinke = null;
        } else {
            drinke = drink;
        }
        cubeLemon(cubeLemon);

        showOrders();
    }

    void cubeLemon(String[] plus) {
        if (plus[0].equals("yes")) {
            cubes = true;
        } else {
            cubes = false;
        }
        if (plus[1].equals("yes")) {
            lemon = true;
        } else {
            lemon = false;
        }
    }

    void showOrders() {
        showOrder();
    }

    abstract void showOrder();
}
