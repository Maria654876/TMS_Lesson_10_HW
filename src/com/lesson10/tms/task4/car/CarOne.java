package com.lesson10.tms.task4.car;

import java.util.Objects;

public class CarOne extends Car {
   String countryOfIssue;

    public CarOne(String brand, String model, String yearRelease, String color, String countryOfIssue) {
        super(brand, model, yearRelease, color);
        this.countryOfIssue = countryOfIssue;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        CarOne carOne = (CarOne) o;
        return countryOfIssue.equals(carOne.countryOfIssue);
    }

    @Override
    public int hashCode() {
        return Objects.hash(countryOfIssue);
    }

    @Override
    public String toString() {
        return "CarOne{" +
                "brand='" + brand + '\'' +
                ", model='" + model + '\'' +
                ", yearRelease='" + yearRelease + '\'' +
                ", color='" + color + '\'' +
                ", countryOfIssue='" + countryOfIssue + '\'' +
                '}';
    }
}
