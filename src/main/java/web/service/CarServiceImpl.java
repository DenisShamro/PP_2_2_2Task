package web.service;

import org.springframework.stereotype.Service;
import web.models.Car;

import java.util.ArrayList;
import java.util.List;

@Service
public class CarServiceImpl implements CarService {
    private List<Car> carsList;
    private static long CAR_COUNT = 0;

    {
        carsList = new ArrayList<>();
        carsList.add(new Car(++CAR_COUNT, "Audi", 6000.00));
        carsList.add(new Car(++CAR_COUNT, "BMW", 7000.00));
        carsList.add(new Car(++CAR_COUNT, "Honda", 999.99));
        carsList.add(new Car(++CAR_COUNT, "Mercedes", 9000.00));
        carsList.add(new Car(++CAR_COUNT, "Volvo", 5000.00));

    }

    @Override
    public List<Car> getCarsByCount(Integer count) {
        if (count != null && count < 5 && count > 0) {
            return carsList.subList(0, count);
        } else {
            return carsList;
        }
    }
}
