package codewars;
import java.util.*;

public class Master {
    public static void main(String[] args) {
        method();
    }

    public static void method() {
        String[] catsName = {"Bella", "Tigger", "Chloe", "Shadow", "Luna", "Oreo", "Oliver","Kity", "Lucy", "Molly","Jasper","Smokey","Gizmo","Simba","Tiger",
                "Charlie","Angel","Jack","Lily","Peanut","Toby","Baby","Loki","Midnight","Milo","Princess","Sophie","Harley","Max","Missy","Rocky","Zoe","CoCo","Misty","Nala",
                "Oscar","Pepper","Sasha","Pumpkin","Kiki","Mittens","Callie","Lucky","Patches","Simon","Garfield","George","Maggie","Sammy","Sebastian","Boots","Cali","Felix","Lilly",
                "Phoebe","Sassy","Tucker","Bandit","Dexter","Fiona","Jake","Precious","Romeo","Snickers","Socks","Daisy","Gracie","Lola","Sadie","Sox","Casper","Fluffy","Marley","Minnie",
                "Sweetie","Ziggy","Belle","Blackie","Chester","Frankie","Ginger","Muffin","Murphy","Rusty","Scooter","Batman","Boo","Cleo","Izzy","Jasmine","Mimi","Sugar","Cupcake",
                "Dusty","Leo","Noodle","Panda","Peaches"};
        Random ran = new Random();
        Scanner scanner = new Scanner(System.in);
        List<Object>cat = new LinkedList<>();
        List<Object>dogs = new LinkedList<>();
        List<Integer>all = new LinkedList<>();
        List<Object>allLinked = new ArrayList<>();
        int random = ran.nextInt(1,7);
        int megaRan = ran.nextInt(50);
        Cat cat1 = new Cat(catsName[megaRan],random );
        Dog dog = new Dog(catsName[megaRan],random );
        for (int i = 1; i < 10 ; i++) {
           int r = ran.nextInt(1,7);
            int randoms = ran.nextInt(50);
            Cat cat2 = new Cat(catsName[randoms],r);
            Dog dog1 = new Dog(catsName[randoms],r);
            all.add(cat2.getAge());
            all.add(dog1.getAge());
            dogs.add(dog1);
            cat.add(cat2);

        //for (int i = 1; i < 10 ; i++) {
           if (i%3==0){
               int superRan = ran.nextInt(1,7);
               int nameCats = ran.nextInt(50);
               Mouse mouse = new Mouse(catsName[nameCats], superRan);
               all.add(mouse.getAge());
               int y = allLinked.lastIndexOf(dogs);
               allLinked.add(y,mouse);
               //allLinked.add(mouse);
               dogs.add(mouse);
           }
        }
            all.add(dog.getAge());
        all.add(cat1.getAge());
        cat.add(cat1);
        dogs.add(dog);
        allLinked.addAll(cat);
        allLinked.add("\n");
        allLinked.addAll(dogs);
        cat.set(4,"cat delete");
        System.out.println(cat+"\n"+dogs+"\n");
        int sum = 0;
        for (Integer e:all) {
        sum+=e;
        }
            System.out.println("sum all age:"+sum+"\n");
        LinkedList<Object> objects = new LinkedList<>(allLinked);
        System.out.println(objects);
            }
        }