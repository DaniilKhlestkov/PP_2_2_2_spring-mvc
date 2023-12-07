package web.service;

import org.springframework.stereotype.Service;
import web.model.Car;

import java.util.ArrayList;
import java.util.List;
@Service
public class CarServiceImpl implements CarService{
    @Override
    public List<Car> getCar(int number) {

        Car car1 = new Car("Peugeot", "FWD", 308);
        Car car2 = new Car("BMW", "RWD", 2);
        Car car3 = new Car("Toyota", "4WD", 4);
        Car car4 = new Car("volkswagen", "AWD", 7);

        List<Car> myCars;

        {
            myCars = new ArrayList<>();
            myCars.add(car1);
            myCars.add(car2);
            myCars.add(car3);
            myCars.add(car4);
        }
        switch (number) {
            case (1):
                myCars.subList(1,5).clear();
                return myCars;

            case (2):
                myCars.subList(2,5).clear();
                return myCars;

            case (3):
                myCars.subList(3,5).clear();
                return myCars;

            case (4):
                myCars.subList(4,5).clear();
                return myCars;

            default:
                return myCars;
        }
    }
}
