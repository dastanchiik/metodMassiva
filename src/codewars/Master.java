package codewars;

import java.util.Scanner;

public class Master {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        method("Dastan", "tan");
    }

    public static void method(String stres, String endin) {
        Scanner scanner = new Scanner(System.in);
        String str = scanner.next();
        String ending = scanner.next();
        String expected = str.substring(ending.length()-1);
        if (ending.equals(expected)) {
            System.out.println("true");
        } else {
            System.out.println("false");
        }
    }
}
