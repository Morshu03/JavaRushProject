package com.example.javarushproject.model

import java.util.*

class Cat(height: Int, weight: Int, name: String?, private val lives: Int) : Animal(height, weight, name!!) {

    override fun toString(): String {
        return "Cat{" +
                "height=" + super.getHeight() +
                ", weight=" + super.getWeight() +
                ", name=" + super.getName() +
                ", lives=" + lives +
                '}'
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other == null || javaClass != other.javaClass) return false
        if (!super.equals(other)) return false
        val cat = other as Cat
        return lives == cat.lives
    }

    override fun hashCode(): Int {
        return Objects.hash(super.hashCode(), lives)
    }
}