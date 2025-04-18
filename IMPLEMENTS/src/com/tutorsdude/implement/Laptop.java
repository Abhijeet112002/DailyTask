package com.tutorsdude.implement;

public class Laptop implements ElectronicDevice{

    public void name(){
        System.out.println(" name of the elecronic device is laptop");
    }

    public  void price(){
        System.out.println("ranges between 25k to one lack ruppes");
    }

    @Override
    public void brand() {
        System.out.println("laptop brand is Hp");
    }

    @Override
    public void popularity() {
        System.out.println("now a days laptop is most used electronic device");
    }
}
