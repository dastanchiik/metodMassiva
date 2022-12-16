import java.util.List;

public class Car implements CarId{
private String mark;
private int number;

    public Car(String mark, int number) {
        this.mark = mark;
        this.number = number;
    }

    @Override
    public String toString() {
        return "Car{" +
                "mark='" + mark + '\'' +
                ", nomer='" + number + '\''+'}';
    }

    public String getMark() {
        return mark;
    }

    public void setMark(String mark) {
        this.mark = mark;
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
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