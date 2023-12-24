package pr16_z7;

import java.util.Scanner;

/*Удалите блоки try-catch для всех методов, кроме одного, который
обрабатывает исключение. Добавьте throws, котрый бросает исключение
методу, который проходит исключение без обработки. */

public class ThrowsDemo1 {
    public static void main(String[] args) throws Exception {
        getKey();
    }

    public static void getKey() {
        Scanner myScanner = new Scanner(System.in);
        System.out.println("Enter a key:");
        try {
            printMessage(myScanner.next());
        } catch (Exception e) {
            System.out.println("Exception: " + e.getMessage());
        } finally {
            myScanner.close();
        }
    }

    public static void printMessage(String key) throws Exception {
        String message = getDetails(key);
        System.out.println(message);
    }

    private static String getDetails(String key) throws Exception {
        if (key == "") {
            throw new Exception("Key set to empty string");
        }
        return "data for " + key;
    }
}
