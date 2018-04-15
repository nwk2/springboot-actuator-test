package hello.Service;
import hello.Dao.CarDao;
import hello.Entity.Car;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Collection;

@Service
public class CarService {

    @Autowired
    private CarDao carDao;

    public Collection<Car> getAllCars(){
        return carDao.getAllCars();
    }
}
