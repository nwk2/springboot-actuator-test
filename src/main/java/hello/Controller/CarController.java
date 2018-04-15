package hello.Controller;

import hello.Entity.Car;
import hello.Service.CarService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.Collection;

@RestController
@CrossOrigin(origins = "http://localhost:3000")
@RequestMapping("/cars")
public class CarController {

    @Autowired
    private CarService carService;

    @RequestMapping(method = RequestMethod.GET)
    public Collection<Car> getAllCars(){
        return this.carService.getAllCars();
    }

    /*@RequestMapping(value = "/{id}", method = RequestMethod.GET)
    public Car getCarById(@PathVariable("id") int id) {
        return carService.getCarById(id);
    }*/
}
