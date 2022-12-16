import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        method();
    }

    public static void method() {
        Scanner scanner1 = new Scanner(System.in);
        Scanner scanner = new Scanner(System.in);
        List<People> people = new ArrayList<>();
        List<Car> cars = new ArrayList<>();
        System.out.println("1)Ведите данные(водителя)" + "\n" + "2)Ведите данные(автомобиль)" + "\n" + "3)удалить по ИД(автомобиля)" + "\n" + "4)удалить по ИД(водитель)\n5)удалить всё(водитель)\n6)вывести данные\n7)удалить всё(машины)");
        int a = scanner.nextInt();
        while (true) {
            if (a == 1) {
                System.out.println("Ведите имя");
                String name = scanner1.nextLine();
                System.out.println("Ведите возраст");
                int age = scanner.nextInt();
                People people1 = new People(name, age);
                System.out.println("People:" + people1);
                people.add(people1);
                System.out.println("1)Ведите данные(водителя)" + "\n" + "2)Ведите данные(автомобиль)" + "\n" + "3)удалить по ИД(автомобиля)" + "\n" + "4)удалить по ИД(водитель)\n5)удалить всё(водитель)\n6)вывести данные\n7)удалить всё(машины)");
                a = scanner.nextInt();
            }
            if (a == 2) {
                System.out.println("Ведите марку");
                String marka = scanner1.nextLine();
                System.out.println("Ведите номер");
                int number = scanner.nextInt();
                Car car1 = new Car(marka, number);
                System.out.println("Car:" + car1);
                cars.add(car1);
                System.out.println("1)Ведите данные(водителя)" + "\n" + "2)Ведите данные(автомобиль)" + "\n" + "3)удалить по ИД(автомобиля)" + "\n" + "4)удалить по ИД(водитель)\n5)удалить всё(водитель)\n6)вывести данные\n7)удалить всё(машины)");
                a = scanner.nextInt();

            }
            if (a == 3) {
                System.out.println("Index:");
                a = scanner.nextInt();
                cars.remove(a);
                System.out.println("1)Ведите данные(водителя)" + "\n" + "2)Ведите данные(автомобиль)" + "\n" + "3)удалить по ИД(автомобиля)" + "\n" + "4)удалить по ИД(водитель)\n5)удалить всё(водитель)\n6)вывести данные\n7)удалить всё(машины)");
                a = scanner.nextInt();
            }
            if (a == 4) {
                System.out.println("Index:");
                a = scanner.nextInt();
                people.remove(a);
                System.out.println("1)Ведите данные(водителя)" + "\n" + "2)Ведите данные(автомобиль)" + "\n" + "3)удалить по ИД(автомобиля)" + "\n" + "4)удалить по ИД(водитель)\n5)удалить всё(водитель)\n6)вывести данные\n7)удалить всё(машины)");
                a = scanner.nextInt();
            }
            if (a == 5) {
                people.removeAll(people);
                System.out.println("1)Ведите данные(водителя)" + "\n" + "2)Ведите данные(автомобиль)" + "\n" + "3)удалить по ИД(автомобиля)" + "\n" + "4)удалить по ИД(водитель)\n5)удалить всё(водитель)\n6)вывести данные\n7)удалить всё(машины)");
                a = scanner.nextInt();
            }
            if (a == 6) {
                System.out.println("\nВодитель:" + people);
                System.out.println("\nМашина:" + cars+"\n");
                System.out.println("1)Ведите данные(водителя)" + "\n" + "2)Ведите данные(автомобиль)" + "\n" + "3)удалить по ИД(автомобиля)" + "\n" + "4)удалить по ИД(водитель)\n5)удалить всё(водитель)\n6)вывести данные\n7)удалить всё(машины)");
                a = scanner.nextInt();
            }
            if (a==7){
                cars.removeAll(cars);
                System.out.println("1)Ведите данные(водителя)" + "\n" + "2)Ведите данные(автомобиль)" + "\n" + "3)удалить по ИД(автомобиля)" + "\n" + "4)удалить по ИД(водитель)\n5)удалить всё(водитель)\n6)вывести данные\n7)удалить всё(машины)");
                a = scanner.nextInt();

            }
        }
    }
}