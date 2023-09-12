package web.service;

import web.model.Car;

import java.util.ArrayList;
import java.util.List;

public class CarServiceImp implements CarService {

    private List<Car> carList = new ArrayList<>() {
        {
            add(new Car(1,"lada",1111));
            add(new Car(2,"audi",2222));
            add(new Car(3,"opel",3333));
            add(new Car(4,"bmw",4444));
            add(new Car(5,"golf",5555));
        }
    };

    @Override
    public List<Car> getCountCars(int count) {
        return carList.stream().limit(count).toList();
    }
}
