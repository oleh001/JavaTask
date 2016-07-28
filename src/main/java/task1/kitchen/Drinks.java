package task1.kitchen;

import java.util.Arrays;

/**
 * Created by user on 27.07.2016.
 */
public enum Drinks {
    Juice(10),
    Water(5);

    private int price;

    Drinks(int price) {
        this.price = price;
    }

    public static String allDrinksToString() {

        if (values().length == 0) {
            return "";
        }
        return Arrays.toString(values()).substring(1, Arrays.toString(values()).length() - 1);
    }

    public int getPrice() {
        return price;
    }
}
