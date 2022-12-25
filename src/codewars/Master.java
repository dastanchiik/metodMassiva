package codewars;

import java.util.Scanner;

public class Master {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        method("Dastan", "fan");
    }

    public static void method(String str, String ending) {
        String expected = str.substring(ending.length());
        if (ending.equals(expected)) {
            System.out.println("true");
        } else {
            System.out.println("false");
        }
    }
}
