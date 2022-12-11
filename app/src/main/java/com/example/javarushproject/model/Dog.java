package com.example.javarushproject.model;

import androidx.annotation.NonNull;

import java.util.List;
import java.util.Objects;
import java.util.Set;

public class Dog {
    private int height;
    private int weight;

    public Dog() {
        this.height = 0;
        this.weight = 0;
    }

    public Dog(int weight, int height) {
        this.height = height;
        this.weight = weight;
    }

    @NonNull
    @Override
    public String toString() {
        return "Dog{" +
                "height=" + height +
                ", weight=" + weight +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Dog dog = (Dog) o;
        return getHeight() == dog.getHeight() && getWeight() == dog.getWeight();
    }

    @Override
    public int hashCode() {
        return Objects.hash(getHeight(), getWeight());
    }

    public void setHeight(int height) {
        this.height = height;
    }

    public int getHeight() {
        return height;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public int getWeight() {
        return weight;
    }

}
