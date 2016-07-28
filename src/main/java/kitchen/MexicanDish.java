package kitchen;

/**
 * Created by user on 27.07.2016.
 */
public class MexicanDish implements Restaurant {

    String customer;
    Dishes lanche;
    Drinks drinke;
    boolean cubes;
    boolean lemon;
    int price;

    public MexicanDish(String customer) {
        this.customer = customer;
    }

    public void lanch(Dishes dish) {
        if (dish == null) {
            System.out.println("No Dishes");
            lanche = null;
        } else {
            lanche = dish;
        }
    }

    public void drink(Drinks drink, String[] cubeLemon) {
        if (drink == null) {
            System.out.println("No Drinks");
            drinke = null;
        } else {
            drinke = drink;
        }
        cubeLemon(cubeLemon);

        showOrder();
    }

    public void cubeLemon(String[] plus) {
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

    public void showOrder() {
        System.out.print(getCustomer() + " ordered Mexican: dish - "
                + getLanche() + " (" + getLanche().getPrice() + "$) "
                + ", " + "drink - " + getDrinke() + " (" + getDrinke().getPrice() + "$) ");
        if (cubes) {
            System.out.print(" with ice cubes");
        }
        if (lemon) {
            System.out.print(" with lemon");
        }
        System.out.println();
    }


    public String getCustomer() {
        return customer;
    }

    public Dishes getLanche() {
        return lanche;
    }

    public Drinks getDrinke() {
        return drinke;
    }

    public boolean isCubes() {
        return cubes;
    }

    public boolean isLemon() {
        return lemon;
    }

    public int getPrice() {
        return price;
    }
}
