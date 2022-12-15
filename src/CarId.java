import java.util.List;

public interface CarId {
    Car save(Car car);
    void deleteCar(int a);
    Car getUserId(int a);
    List<Car> getAll();
}