package web.service;

import web.domain.entity.Car;

import java.util.List;

public interface CarService {
    List<Car> getCars(Integer count);
}
