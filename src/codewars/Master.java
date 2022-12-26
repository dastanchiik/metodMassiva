package codewars;
import java.util.LinkedList;
import java.util.Random;
import java.util.Scanner;

public class Master {
    public static void main(String[] args) {
        method();
    }

    public static void method() {
        Random ran = new Random();
        Scanner scanner = new Scanner(System.in);
        LinkedList<Integer>cat = new LinkedList<>();
        LinkedList<Integer>dogs = new LinkedList<>();
        int random = ran.nextInt(1,7);
        dogs.add(random);
        System.out.println(random);

        int b = 0;
        for (int i = 1; i <50 ; i++) {
           int r = ran.nextInt(1,7);
            dogs.add(r);
        }
        System.out.println("finish");
            }
        }