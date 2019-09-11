package com.project.cars.controller

import com.project.cars.model.Car
import com.project.cars.repository.CarRepository
import org.springframework.web.bind.annotation.*
import java.util.*
import javax.validation.Valid

@RestController
@RequestMapping("/car")
class CarController(private val carRepository: CarRepository) {



    @GetMapping("/list")
    fun getAll(): MutableList<Car>{

        return carRepository.findAll()

    }


    @PostMapping("/add")
    fun addCar(@Valid @RequestBody car: Car): Car{
        car.dateAdded = Date().toString()
        return carRepository.save(car)
    }

}