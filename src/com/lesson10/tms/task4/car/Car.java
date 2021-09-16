package com.lesson10.tms.task4.car;

import java.util.Objects;

public abstract class Car {
    String brand;
    String model;
    String yearRelease;
    String color;

    public Car(String brand, String model, String yearRelease, String color) {
        this.brand = brand;
        this.model = model;
        this.yearRelease = yearRelease;
        this.color = color;
    }
}
