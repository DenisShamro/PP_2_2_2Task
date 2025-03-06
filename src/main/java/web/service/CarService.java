package web.service;

import web.models.Car;

import java.util.List;

public interface CarService {
     List<Car> getNCars(int count);
     public List<Car> getCarsList();
}
