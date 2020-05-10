package com.errorhandling.graphqlerrorhandling.model

data class Car(val name: String, val price: Int, val engineType: String)

data class CarInput(val name: String, val price: Int, val engineType: String)