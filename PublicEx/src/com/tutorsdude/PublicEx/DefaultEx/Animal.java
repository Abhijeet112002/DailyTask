package com.tutorsdude.PublicEx.DefaultEx;

public class Animal {
    String name;
    String color;
    int age;

    class Dog{
        void eat(){
            System.out.println("Dog eat");
        }
    }

    Animal() {
        System.out.println("Animal Constructor");
    }

    Animal(String name, String color, int age) {
        this.name = name;
        this.color = color;
        this.age = age;
    }

    static void animal(){
        System.out.println("AnimaS are living organism");


    }

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
