package metod;

import java.util.Scanner;

public class Major {
    public static void main(String[] args) {
        method();
    }

    public static void method() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("1 -> name  \n2 -> age \n3 -> name and age");
        int a = scanner.nextInt();
        Kubat kubat = new Kubat("Kubat", 9);
        while (true) {
            if (a == 1) {
                System.out.println(kubat.name());
                System.out.println("1 -> name  \n2 -> age \n3 -> name and age");
                a = scanner.nextInt();
            } else if (a == 2) {
                System.out.println(kubat.age());
                System.out.println("1 -> name  \n2 -> age \n3 -> name and age");
                a = scanner.nextInt();
            } else if (a == 3) {
                System.out.println(kubat);
                System.out.println("1 -> name  \n2 -> age \n3 -> name and age");
            a = scanner.nextInt();
            }
        }
    }
}
