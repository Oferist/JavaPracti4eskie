package pr16_z8;

import java.util.Scanner;

public class ThrowsDemo {
    public static void main(String[] args) {
        getKey();
    }

    public static void getKey() {
        Scanner myScanner = new Scanner(System.in);
        System.out.println("Enter a key:");
        String key = "";
        int valid = 0;
        while (valid != 2) {
            try {
                key = myScanner.next();
                printMessage(key);
                valid += 1;
            } catch (Exception e) {
                System.out.println("Exception: " + e.getMessage());
                System.out.println("Please enter a non-empty key:");
            }
        }
        myScanner.close();
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

