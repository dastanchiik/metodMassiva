package codewars;

import java.util.Scanner;

public class Master {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        method("Dastan", "an");
    }

    public static void method(String str, String ending) {
        System.out.println(str.endsWith(ending));
    }
}
