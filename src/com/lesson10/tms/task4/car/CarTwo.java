package com.lesson10.tms.task4.car;

import java.util.Objects;

public class CarTwo extends Car {

    String engineModel;

    public CarTwo(String brand, String model, String yearRelease, String color, String engineModel) {
        super(brand, model, yearRelease, color);
        this.engineModel = engineModel;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        CarTwo carTwo = (CarTwo) o;
        return engineModel.equals(carTwo.engineModel);
    }

    @Override
    public int hashCode() {
        return Objects.hash(engineModel);
    }

    @Override
    public String toString() {
        return "CarTwo{" +
                "brand='" + brand + '\'' +
                ", model='" + model + '\'' +
                ", yearRelease='" + yearRelease + '\'' +
                ", color='" + color + '\'' +
                ", engineModel='" + engineModel + '\'' +
                '}';
    }
}
