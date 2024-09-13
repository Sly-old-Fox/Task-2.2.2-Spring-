package web.service;

import org.springframework.stereotype.Service;
import web.model.Car;

import java.util.ArrayList;
import java.util.List;

@Service
public class CarServiceImpl implements CarService {

    private List<Car> cars;

    public CarServiceImpl() {
        cars = new ArrayList<>();
        cars.add(new Car("Lada", "red", 6000));
        cars.add(new Car("BMW", "black", 50000));
        cars.add(new Car("Mitsubishi", "yellow", 95000));
        cars.add(new Car("Reno", "white", 4000));
        cars.add(new Car("Honda", "black", 12000));
    }

    @Override
    public List<Car> getCars(Integer count) {
        if (count == null || count < 0 || count >= cars.size()) {
            return cars;
        } else return cars.subList(0, count);
    }
}
