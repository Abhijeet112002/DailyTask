package com.tutordude.classTest;

public class Car {

    // class and objects

   public  String name;  // states
  public   int noOfWheels;
   public  String model;
  public   int price;


    public static void moving(){    // behaviors
        System.out.println("hello");
    }

    public static void brake(){
        System.out.println("it stops the car");
    }

    // constructor in java

    public Car(String name,int noOfWheels,String model, int price){
        this.name = name;
        this.price = price;
        this.model = model;
        this.noOfWheels = noOfWheels;

        System.out.println(" my constusctor");

    }






}
