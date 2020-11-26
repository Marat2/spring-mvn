package web.service;

import org.springframework.stereotype.Component;
import web.domain.entity.Car;

import java.util.ArrayList;
import java.util.List;

@Component
public class CarServiceImpl implements CarService{

    ArrayList<Car> carList = new ArrayList<>();

    @Override
    public List<Car> getCars(Integer count) {
        carList.add(new Car(1,"name","model"));
        carList.add(new Car(2,"name1","model1"));
        carList.add(new Car(3,"name2","model2"));
        carList.add(new Car(4,"name3","model3"));
        carList.add(new Car(5,"name4","model4"));
        if (count >= 5){
            count = 5 - 1;
        }
        return carList.subList(0,count);
    }

}
