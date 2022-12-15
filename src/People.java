import java.util.List;

public class People implements CarId{
    private String name;
    private int age;

    public People(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "People" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }

    @Override
    public Car save(Car car) {
        return null;
    }

    @Override
    public void deleteCar(int a) {

    }

    @Override
    public Car getUserId(int a) {
        return null;
    }

    @Override
    public List<Car> getAll() {
        return null;
    }
}
