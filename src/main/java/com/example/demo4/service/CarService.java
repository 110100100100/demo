package com.example.demo4.service;

import com.example.demo4.model.Car;
import com.example.demo4.repository.CarRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CarService {
    @Autowired
    private CarRepository carRepository;

    public List<Car> getCarList() {
        return carRepository.getCarList();
    }

    public void createCar(Car car) {
        carRepository.createCar(car);
    }

    public Car getCarById(int id) {
        return carRepository.getCarById(id);
    }

    public void updateCar(Car car){
        carRepository.updateCar(car);
    }

    public void deleteCar(int id) {
        carRepository.deleteCar(id);
    }
    public Car getCarByName(String name){
        carRepository.getCarByName(name);
        return null;
    }
}
