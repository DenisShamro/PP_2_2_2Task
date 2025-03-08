package web.service;

import web.models.Car;

import java.util.List;

public interface CarService {
     List<Car> getNCars(int count);
     List<Car> getCarsList();
     List<Car> choiceMet(Integer count);
}
