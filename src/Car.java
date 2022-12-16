import java.util.List;

public class Car implements CarId{
private String mark;
private int nomer;

    public Car(String mark, int nomer) {
        this.mark = mark;
        this.nomer = nomer;
    }

    @Override
    public String toString() {
        return "Car{" +
                "mark='" + mark + '\'' +
                ", nomer='" + nomer + '\''+'}';
    }

    public String getMark() {
        return mark;
    }

    public void setMark(String mark) {
        this.mark = mark;
    }

    public int getNomer() {
        return nomer;
    }

    public void setNomer(int nomer) {
        this.nomer = nomer;
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
