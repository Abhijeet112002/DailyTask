package com.tutorsdude.PublicEx.PublicExample;

public class Car {

    public String name;
    public String color;
    public int year;
    public String engine;


    public static void carInfo() {
        System.out.println("owning  a car is another level of happiness");

    }

    public Car() {
        System.out.println("my car is good ");
    }

     public Car(String name, String color, int year, String engine) {
                this.name = "mercedes";
                this.color = "color";
                this.year = 2002;
                this.engine = "engine";


        }



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







