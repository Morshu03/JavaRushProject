package com.example.javarushproject.model;

import androidx.annotation.NonNull;

import java.util.Objects;

public class Cat extends Animal {
    private int lives;

    public Cat(int height, int weight, String name, int lives) {
        super(height, weight, name);
        this.lives = lives;
    }

    public int getLives() {
        return lives;
    }

    @Override
    public String toString() {
        return "Cat{" +
                "height=" + super.getHeight() +
                ", weight=" + super.getWeight() +
                ", name=" + super.getName() +
                ", lives=" + lives +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        Cat cat = (Cat) o;
        return lives == cat.lives;
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), lives);
    }
}
