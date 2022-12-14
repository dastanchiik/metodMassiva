import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        for (int i = 1; i <= ints().length; i++) {
            System.out.print(i+",");
        }
    }
    public static int[] ints(){
        return new int[]{1,2,3,4,5};
    }
}