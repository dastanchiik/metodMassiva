package codewars;


import java.nio.CharBuffer;
import java.util.Arrays;
import java.util.Scanner;

public class Master {
    public static void main(String[] args) {
        method("Dastan", "fan");
    }

    public static void method(String str, String ending) {
        Scanner scanner = new Scanner(System.in);
        System.out.println(str + "\n" + ending);
        int st = ending.length();
        int count = st - 1;
        int counter = st - count;
        String string = str.substring(st);
        if (ending.equals(string)) {
            System.out.println("true");
        } else {
            System.out.println("false");
        }
    }
}
