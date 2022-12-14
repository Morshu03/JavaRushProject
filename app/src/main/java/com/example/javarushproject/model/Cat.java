package com.example.javarushproject.model;

import androidx.annotation.NonNull;

import java.util.Objects;

public class Cat {
    private final int height;
    private final int weight;
    private final int lives;
    private final String name;


    public Cat(int height, int weight, int lives, String name) {
        this.height = height;
        this.weight = weight;
        this.lives = lives;
        this.name = name;
    }

    @NonNull
    public String toString(){
        return "Cat{" +
                "height=" + height +
                ", weight=" + weight +
                ", lives=" + lives +
                ", name=" + name +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Cat cat = (Cat) o;
        return height == cat.height && weight == cat.weight && lives == cat.lives && Objects.equals(name, cat.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(height, weight, lives, name);
    }
}
