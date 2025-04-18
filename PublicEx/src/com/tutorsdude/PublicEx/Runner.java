package com.tutorsdude.PublicEx;

import com.tutorsdude.PublicEx.ProtectedEx.Application;
import com.tutorsdude.PublicEx.ProtectedEx.Software;
import com.tutorsdude.PublicEx.PublicExample.Car;

public class Runner extends Application {

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


        Application.application();
        Software.software();






    }
}
