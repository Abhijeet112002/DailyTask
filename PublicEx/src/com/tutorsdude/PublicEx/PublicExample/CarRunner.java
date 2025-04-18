package com.tutorsdude.PublicEx.PublicExample;

public class CarRunner {
    public static void main(String[] args) {
        Car car = new Car();
        car.name = "mercedes";
        System.out.println(car.name);
        car.color = "red";
        System.out.println(car.color);
        car.engine = "xyz";
        System.out.println(car.engine);
        car.year = 2002;
        System.out.println(car.year);

        Car.carInfo();

        new Car();
    }
}
