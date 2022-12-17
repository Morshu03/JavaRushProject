package com.example.javarushproject.model;

public class Dog extends Animal{
    public Dog(int height, int weight, String name) {
        super(height, weight, name);
    }

    @Override
    public String toString() {
        return "Dog{" +
                "height=" + super.getHeight() +
                ", weight=" + super.getWeight() +
                ", name=" + super.getName() +
                '}';
    }

}
