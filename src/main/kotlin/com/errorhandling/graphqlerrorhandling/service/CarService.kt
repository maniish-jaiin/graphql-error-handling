package com.errorhandling.graphqlerrorhandling.service

import com.errorhandling.graphqlerrorhandling.exception.CarNotFoundException
import com.errorhandling.graphqlerrorhandling.model.Car
import com.errorhandling.graphqlerrorhandling.model.CarInput
import org.springframework.stereotype.Service

@Service
class CarService {
    fun getCar(input: String): Car {
        return CarMap.cars[input]
                ?: throw CarNotFoundException("Car with name = $input not found",
                        mapOf("name" to input))
    }

    fun createCar(input: CarInput): Car {
        val car = Car(input.name, input.price, input.engineType)
        CarMap.cars[input.name] = car
        return car
    }
}

object CarMap {
    val cars = HashMap<String, Car>()
}