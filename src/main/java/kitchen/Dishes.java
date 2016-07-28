package kitchen;

import java.util.Arrays;

/**
 * Created by user on 27.07.2016.
 */
public enum Dishes {
    Fish(30),
    Steak(36),
    Soup(12);

    private int price;

    Dishes(int price) {
        this.price = price;
    }

    public static String allDishesToString() {
        if (values().length == 0) {
            return "";
        }
        return Arrays.toString(values()).substring(1, Arrays.toString(values()).length() - 1);
    }

    public int getPrice() {
        return price;
    }
}
