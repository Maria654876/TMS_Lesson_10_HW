package com.lesson10.tms.task4.car;

import com.lesson10.tms.task4.car.Car;

public class CarTree extends Car {


    public CarTree(String brand, String model, String yearRelease, String color) {
        super(brand, model, yearRelease, color);
    }

    @Override
    public int hashCode() {
        return super.hashCode();
    }

    @Override
    public boolean equals(Object obj) {
        return super.equals(obj);
    }

    @Override
    public String toString() {
        return "CarTree{" +
                "brand='" + brand + '\'' +
                ", model='" + model + '\'' +
                ", yearRelease='" + yearRelease + '\'' +
                ", color='" + color + '\'' +
                '}';
    }
}
