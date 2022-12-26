package codewars;

import java.nio.file.FileSystemNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

public class Master {
    public static void main(String[] args) {
        method();
    }

    public static void method() {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Cat>groupCats = new ArrayList<>();
        groupCats.add(new Cat("Borya",3));
        groupCats.add(new Cat("Sima",1));
        groupCats.add(new Cat("Netflix",2));
        System.out.print("Enter name:");
        String name = scanner.next();
        System.out.print("Enter age:");
        int age = scanner.nextInt();
        for (Cat e:groupCats) {
            if (e.getAge()==age && e.getName().equals(name)){
                System.out.println("Cats in group");
                System.out.println(groupCats.contains(e));
                System.out.println(groupCats.indexOf(e));
            } else if (e.getName().equals("Sima") && e.getAge()==1) {

            }
        }
    }
}