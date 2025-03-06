package web.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import web.service.CarService;

@Controller
@RequestMapping("/cars")
public class CarController {
    private final CarService carService;

    @Autowired
    public CarController(CarService carService) {
        this.carService = carService;
    }

    @GetMapping()
    public String showAllCars(@RequestParam(value = "count", required = false) Integer count, Model model) {
        if (count != null && count < 5 && count > 0) {
            model.addAttribute("result1", carService.getNCars(count));
        } else {
            model.addAttribute("result1", carService.getCarsList());
        }
        return "carsView";
    }
}
