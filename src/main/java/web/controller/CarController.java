package web.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import web.domain.entity.Car;
import web.service.CarService;

import java.util.ArrayList;
import java.util.List;

@Controller
public class CarController {

    @Autowired
    CarService carService;

    @GetMapping(value = "/cars")
    public String getCars(ModelMap model,@RequestParam(required = false) Integer count){
        if(count==null){
            count = 5;
        }
        List<Car> cars = carService.getCars(count);
        model.addAttribute("cars", cars);

        System.out.println(cars.toString());
        return "car";
    }
    /*@GetMapping("/cars")
    public String getCarNumber(@RequestParam Integer count, ModelMap model){
        List<Car> cars = carService.getCars(count);
        model.addAttribute("cars", cars);
        return "car";
    }*/
}
