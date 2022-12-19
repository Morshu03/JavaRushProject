package com.example.javarushproject.model

class Dog(height: Int, weight: Int, name: String?) : Animal(height, weight, name!!) {
    override fun toString(): String {
        return "Dog{" +
                "height=" + super.height +
                ", weight=" + super.weight +
                ", name=" + super.name +
                '}'
    }
}