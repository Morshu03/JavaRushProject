package com.example.javarushproject.model;

import androidx.annotation.NonNull;
import java.util.Objects;

public class Dog {
    private final int height;
    private final int weight;
    private final String name;

    public Dog(int weight, int height, String name) {
        this.height = height;
        this.weight = weight;
        this.name = name;
    }

    @NonNull
    @Override
    public String toString() {
        return "Dog{" +
                "height=" + height +
                ", weight=" + weight +
                ", name=" + name +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Dog dog = (Dog) o;
        return height == dog.height && weight == dog.weight && Objects.equals(name, dog.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(height, weight, name);
    }

}
