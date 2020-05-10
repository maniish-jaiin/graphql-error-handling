package com.errorhandling.graphqlerrorhandling.graphql

import com.coxautodev.graphql.tools.GraphQLMutationResolver
import com.errorhandling.graphqlerrorhandling.model.Car
import com.errorhandling.graphqlerrorhandling.model.CarInput
import com.errorhandling.graphqlerrorhandling.service.CarService
import org.springframework.stereotype.Component

@Component
class CarMutationResolver(private val carService: CarService) : GraphQLMutationResolver {
    fun createCar(input: CarInput): Car {
        return carService.createCar(input)
    }
}