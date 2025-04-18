package com.tutorsdude.implement;

public class InterfaceRunner {

    public static void main(String[] args) {

        Mango mango = new Mango();

        mango.name();
        mango.price();
        mango.scientificName();
        mango.drink();

//--------------------------------------
        ViratKohali virat = new ViratKohali();

        virat.age();
        virat.name();
        virat.nameOfCountry();
        virat.runs();

//--------------------------------------------------

        Instagram instagram = new Instagram();

        instagram.language();
        instagram.popularity();
        instagram.rating();
        instagram.developed();

//----------------------------------------------

        Redmi redmi = new Redmi();

        redmi.battery();
        redmi.brand();
        redmi.price();
        redmi.processor();

//------------------------------------------
        Laptop laptop = new Laptop();

        laptop.brand();
        laptop.name();
        laptop.price();
        laptop.popularity();
    }
}
