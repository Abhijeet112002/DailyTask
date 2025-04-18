package com.tutorsdude.hospital.Hospital;

public class PatientAddress {

    public String name;
    public String area;
    public String city;
    public int pinCode;

    public void printall(){
        System.out.println("Name: " + name);
        System.out.println("Area: " + area);
        System.out.println("City: " + city);
        System.out.println("PinCode: " + pinCode);

    }
}
