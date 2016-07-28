import kitchen.Dishes;
import kitchen.Drinks;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * Created by user on 27.07.2016.
 */
public class ConsoleHelpers {

    private static BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));


    public static void writeMessage(String message) {
        System.out.println(message);
    }


    public String readString() throws IOException {

        String message;
        message = reader.readLine();

        return message;
    }

    public Dishes getAllDishes() throws IOException {

        Dishes listDish = null;

        String str = "";
        while (true) {
            writeMessage("All Dishes:\n" + Dishes.allDishesToString());

            str = readString();
            if (str.equalsIgnoreCase("exit")) {
                break;
            } else {
                try {
                    listDish = Dishes.valueOf(str);
                    break;
                } catch (IllegalArgumentException e) {
                    writeMessage(str + " is not detected");
                }
            }
        }

        return listDish;
    }

    public Drinks getAllDrinks() throws IOException {

        Drinks listDrink = null;

        String str = "";
        while (true) {
            writeMessage("All Drinks:\n" + Drinks.allDrinksToString());

            str = readString();
            if (str.equalsIgnoreCase("exit")) {
                break;
            } else {
                try {
                    listDrink = Drinks.valueOf(str);
                    break;
                } catch (IllegalArgumentException e) {
                    writeMessage(str + " is not detected");
                }
            }
        }
        return listDrink;
    }

    public String[] drinkWant() throws IOException {
        writeMessage("if you want ice cubes or/and lemon enter yes yes. If no then not not");
        String[] str = new String[2];
        str[0] = readString();
        str[1] = readString();
        return str;
    }
}
