package metod;

public record Kubat(String name, int age) {
    public Kubat{
        if (age < 0){
            System.out.println("you are stupid ?");
        }
    }
}
