package codewars;


import java.nio.CharBuffer;
import java.util.Arrays;
import java.util.Scanner;

public class Master {
    public static void main(String[] args) {
        method();
    }

    public static void method() {
       Scanner scanner = new Scanner(System.in);
       String name = "abc";
       String sub = name.substring(1);
       String name2 = scanner.next();
       if (name2.equals(sub)){
        System.out.println("true");
    }else {
           System.out.println("false");
       }
    }
}
