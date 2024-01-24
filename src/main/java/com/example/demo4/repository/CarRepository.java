package com.example.demo4.repository;

import com.example.demo4.model.Car;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;

@Repository
public class CarRepository {
    List<Car> carList = new ArrayList<Car>();
    public CarRepository(){
        Car car = new Car(1,"Mercedes GLC300","Xe rất xịn",900000000,"mercedes",true);
        Car car1 = new Car(2,"Honda City","Giá mềm xe đẹp",500000000,"honda",true);
        Car car2 = new Car(3,"Toyota Yaris","Xe giá rẻ",500000000,"toyota",true);


        carList.add(car);
        carList.add(car1);
        carList.add(car2);

    }

    public List<Car> getCarList() {
        return carList;
    }

    public void createCar(Car car) {
        carList.add(car);
    }

    public Car getCarById(int id) {
        for (Car car: carList) {
            if (car.getId() == id) {
                return car;
            }
        }

        return null;
    }

    public void updateCar(Car car) {
        Car carEdit = getCarById(car.getId());
        carEdit.setName(car.getName());
        carEdit.setDetails(car.getDetails());
        carEdit.setPrice(car.getPrice());
        carEdit.setManufacturer(car.getManufacturer());
        carEdit.setStatus(car.isStatus());
    }

    public void deleteCar(int id){
        Car car = getCarById(id);
        carList.remove(car);

    }

    public List<Car> getCarByName(String name) {

        List<Car> result = new ArrayList<>();
        for (Car car :carList) {
            if (car.getName().equals(name)) {
                result.add(car);
            }
        }

        return result;
    }
}
