package web.dao;

import org.springframework.stereotype.Repository;
import web.model.Car;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.IntStream;

@Repository
public class CarDaoImpl implements CarDao {
    private final List<Car> carlist = new ArrayList<>(List.of(
            new Car("BMV", "4WD", 7),
            new Car("AUDI", "9BN", 6),
            new Car("MERSEDES", "7MSE", 200),
            new Car("HONDA", "8BN", 199),
            new Car("TANI", "RV9", 111)
    ));


    @Override
    public List<Car> getCars(Integer count) {
        count = (count == null || count > 5) ? 5 : count < 0 ? 0 : count;
        return carlist.stream().limit(count).toList();
    }
}