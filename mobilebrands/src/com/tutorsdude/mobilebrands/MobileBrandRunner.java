package com.tutorsdude.mobilebrands;

import com.tutorsdude.mobilebrands.inheritance.*;

public class MobileBrandRunner {
    public static void main(String[] args) {

        MobileBrands MB = new MobileBrands();
        System.out.println(MB.brand);
        MB.brand = "Samsung Galaxy";
        System.out.println(MB.brand);
        MB.important();

        Redmi Redmi = new Redmi();
        System.out.println(Redmi.model);
        Redmi.model = "redmi125g";
        Redmi.brand();

        Samsung Samsung = new Samsung();
        System.out.println(Samsung.quality);
        Samsung.quality = "notBad";
        Samsung.brands();

        Vivo Vivo = new Vivo();
        System.out.println(Vivo.sales);
        Vivo.sales = 50;
        Vivo.branded();

        Redmi125G Redmi125g = new Redmi125G();
        System.out.println(Redmi125g.price);
        Redmi125g.price = 15000;
        Redmi125g.good();

        Redmi13C Redmi13c = new Redmi13C();
        System.out.println(Redmi13c.year);
        Redmi13c.year = 2000;
        Redmi13c.mobiletype();

        Samsungs24 Samsungs24 = new Samsungs24();
        System.out.println(Samsungs24.color);
        Samsungs24.color = "red";
        Samsungs24.bad();

        Samsungs25 Samsungs25 = new Samsungs25();
        System.out.println(Samsungs25.quality);
        Samsungs25.quality = "good";
        Samsungs25.Quality();

        Vivot3 Vivot3 = new Vivot3();
        System.out.println(Vivot3.id);
        Vivot3.id = 1001;
        Vivot3.classic();

        Vivoy27 Vivoy27 = new Vivoy27();
        System.out.println(Vivoy27.publishedyear);
        Vivoy27.publishedyear = 2000;
        Vivoy27.verygood();





    }
}
