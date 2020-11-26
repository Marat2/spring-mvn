package web.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import web.service.CarService;

@Controller
public class CarController {

    @Autowired
    CarService carService;

    @GetMapping(value = "/cars")
    public String getCars(ModelMap model){
        model.addAttribute("cars", carService.getCars(5));
        System.out.println(carService.getCars(5).toString());
        return "car";
    }
    /*@GetMapping("/cars")
    public String getCarNumber(@RequestParam Integer count, ModelMap model){
        model.addAttribute("cars", carService.getCars(count));
        return "car";
    }*/
}
