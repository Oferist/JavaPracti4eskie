package pr16_z7;

import java.util.Scanner;

/* Добавьте соответствующие try-catch блоки таким образом, чтобы в
конечном итоге один из них обрабатывал исключение; */

public class ThrowsDemo {
    public static void main(String[] args) throws Exception {
        try {
            getKey();
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }

    public static void getKey() throws Exception {
        Scanner myScanner = new Scanner(System.in);
        System.out.println("Enter a key:");
        String key = myScanner.next();
        try {
            printMessage(key);
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
