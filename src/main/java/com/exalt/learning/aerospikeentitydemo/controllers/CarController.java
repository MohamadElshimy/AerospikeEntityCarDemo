package com.exalt.learning.aerospikeentitydemo.controllers;

import com.exalt.learning.aerospikeentitydemo.entities.CarEntity;
import com.exalt.learning.aerospikeentitydemo.services.CarService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
public class CarController {

    @Autowired
    CarService carService;

    @PostMapping("/cars")
    public void createCar(@RequestBody CarEntity car) {
        carService.createCar(car);
    }

    @GetMapping("/cars")
    public List<CarEntity> readAllCars() {
        return carService.readAllCars();
    }

    @GetMapping("/cars/{id}")
    public Optional<CarEntity> readCarById(@PathVariable("id") Integer id) {
        return carService.readCarById(id);
    }

    @PutMapping("/cars/{id}")
    public void updateCar(@PathVariable("id") Integer id, @RequestBody CarEntity car) {
        carService.updateCar(id, car);
    }

    @DeleteMapping("/cars/{id}")
    public void deleteCarById(@PathVariable("id") Integer id) {
        carService.deleteCarById(id);
    }
}
