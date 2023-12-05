package web.service;

import org.springframework.stereotype.Service;
import web.model.Car;

import java.util.ArrayList;
import java.util.List;
@Service
public class CarServiceImpl implements CarService{
    @Override
    public List<Car> getCar(int number) {
        List<Car> cars = new ArrayList<>();
        cars.add(new Car("Peugeot", "FWD", 308));
        cars.add(new Car("BMW", "RWD", 2));
        cars.add(new Car("Toyota", "4WD", 4));
        cars.add(new Car("volkswagen", "AWD", 7));

        List<Car> subCars = new ArrayList<>();

        if (number < cars.size()) {
            for (int i = 0; i < number; i++) {
                subCars.add(cars.get(i));
            }
            return subCars;
        } else {
            return cars;
        }
    }
}
