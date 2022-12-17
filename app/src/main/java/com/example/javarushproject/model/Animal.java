package com.example.javarushproject.model;

import androidx.annotation.NonNull;

import java.util.Objects;

public class Animal {
    private final int height;
    private final int weight;
    private final String name;


    public Animal(int height, int weight, String name) {
        this.height = height;
        this.weight = weight;
        this.name = name;
    }

    @NonNull
    public String toString(){
        return "animal{" +
                "height=" + height +
                ", weight=" + weight +
                ", name=" + name +
                '}';
    }

    public int getHeight() {
        return height;
    }

    public int getWeight() {
        return weight;
    }

    public String getName() {
        return name;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Animal animal = (Animal) o;
        return height == animal.height && weight == animal.weight && Objects.equals(name, animal.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(height, weight, name);
    }
}
