package io.tutorial.spring.garageApp.service;


import io.tutorial.spring.garageApp.model.Car;
import io.tutorial.spring.garageApp.repository.GarageRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@Service
public class GarageService {


    @Autowired
    private GarageRepository garageRepository;
   /* static private ArrayList<Car> cars = new ArrayList<>(Arrays.asList(
            new Car(1, "Model 3", "Tesla", 2020, Car.Color.RED),
            new Car(2, "Model x", "Tesla", 2021, Car.Color.GREEN),
            new Car(3, "3008", "Peugeot", 2012, Car.Color.BLACK)
    ));*/

    public List<Car> getCars(){
        List<Car> cars = new ArrayList<>();
        garageRepository.findAll().forEach(car -> {
            cars.add(car);
        });
        return cars;
    }

    public Car getCar(long id) {
        //return cars.stream().filter(car -> car.getId()==id).findFirst().orElse(null);
        return garageRepository.findById(id).orElse(null);
    }

    public void deleteCar(long id) {
       // cars.removeIf(car -> car.getId() == id);
        garageRepository.deleteById(id);
    }

    public void addCar(Car car) {
        //cars.add(car);
        garageRepository.save(car);
    }

    public void updateCar(Car car, long id) {
        /*cars.forEach(car1 -> {
            if(car1.getId() == id){
                cars.set(cars.indexOf(car1), car);
            }
        });*/
        garageRepository.save(car);
    }
}
