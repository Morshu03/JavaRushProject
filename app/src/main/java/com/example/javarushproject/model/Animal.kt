package com.example.javarushproject.model

import java.util.*

open class Animal(private val height: Int, private val weight: Int, private val name: String) {

    fun getHeight(): Int {
        return height
    }

    fun getWeight(): Int {
        return weight
    }

    fun getName(): String {
        return name
    }

    override fun toString(): String {
        return "animal{" +
                "height=" + height +
                ", weight=" + weight +
                ", name=" + name +
                '}'
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other == null || javaClass != other.javaClass) return false
        val animal = other as Animal
        return height == animal.height && weight == animal.weight && name == animal.name
    }

    override fun hashCode(): Int {
        return Objects.hash(height, weight, name)
    }
}