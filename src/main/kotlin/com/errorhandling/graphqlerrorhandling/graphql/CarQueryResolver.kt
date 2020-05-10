package com.errorhandling.graphqlerrorhandling.graphql

import com.coxautodev.graphql.tools.GraphQLQueryResolver
import com.errorhandling.graphqlerrorhandling.model.Car
import com.errorhandling.graphqlerrorhandling.service.CarService
import org.springframework.stereotype.Component

@Component
class CarQueryResolver(private val carService: CarService) : GraphQLQueryResolver {
    fun getCar(input: String): Car {
        return carService.getCar(input)
    }
}