import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        method();
    }
    public static void method(){
        Scanner scanner1 = new Scanner(System.in);
        Scanner scanner = new Scanner(System.in);
        List<People> people = new ArrayList<>();
        System.out.println("1)Ведите данные" + "\n" + "2)удаление данных" + "\n" + "3)удалить все" + "\n" + "4)вывод");
        int a = scanner.nextInt();
        while (true) {
            if (a == 1) {
                System.out.println("Ведите имя");
                String name = scanner1.nextLine();
                System.out.println("Ведите возраст");
                int age = scanner.nextInt();
                People people1 = new People(name, age);
                System.out.println(people1);
                people.add(people1);
                System.out.println("1 -> Ведите данные" + "\n" + "2 -> удаление данных" + "\n" + "3 -> удалить все" + "\n" + "4 -> вывод");
                a = scanner.nextInt();
            }
            if (a == 2) {
                System.out.println("Index:");
                a = scanner.nextInt();
                people.remove(a);
                System.out.println("1)Ведите данные" + "\n" + "2)удаление данных" + "\n" + "3)удалить все" + "\n" + "4)вывод");
                a = scanner.nextInt();

            }

            if (a == 3) {
                people.removeAll(people);
                System.out.println("1)Ведите данные" + "\n" + "2)удаление данных" + "\n" + "3)удалить все" + "\n" + "4)вывод");
                a = scanner.nextInt();
            }
            if (a == 4) {
                System.out.println("\n" + people);
                System.out.println("1 -> Ведите данные" + "\n" + "2 -> удаление данных" + "\n" + "3 -> удалить все" + "\n" + "4 -> вывод");
                a = scanner.nextInt();
            }
        }
    }
}