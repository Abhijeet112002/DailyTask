package com.tutorsdude.PublicEx.DefaultEx;

public class AnimalRunner {
    public static void main(String[] args) {
        Animal animal = new Animal();
        animal.name = "dog";
        System.out.println(animal.color);
        animal.color = "black";
        System.out.println(animal.color);
        animal.age = 18;
        System.out.println(animal.age);

        Animal.animal();

        new Animal();



    }
}
