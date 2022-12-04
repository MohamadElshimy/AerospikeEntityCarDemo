package com.exalt.learning.aerospikeentitydemo.services;

import com.exalt.learning.aerospikeentitydemo.entities.CarEntity;
import com.exalt.learning.aerospikeentitydemo.repositories.AerospikeCarRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Service
public class CarService {

    @Autowired
    AerospikeCarRepository aerospikeCarRepository;

    public void createCar(CarEntity car) {
        aerospikeCarRepository.save(car);
    }

    public List<CarEntity> readAllCars() {
        List<CarEntity> cars = new ArrayList<CarEntity>();
        aerospikeCarRepository.findAll().forEach(car -> cars.add(car));
        return cars;
    }

    public Optional<CarEntity> readCarById(int id) {
        return aerospikeCarRepository.findById(id);
    }

    public void updateCar(Integer id, CarEntity car) {
        aerospikeCarRepository.save(car);
    }

    public void deleteCarById(int id) {
        aerospikeCarRepository.deleteById(id);
    }

}
