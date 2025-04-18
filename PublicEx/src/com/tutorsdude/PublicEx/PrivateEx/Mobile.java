package com.tutorsdude.PublicEx.PrivateEx;

public class Mobile {

     private String name;
     private int year;
     private String owner ;

     public static void main(String[] args) {

          Mobile mob = new Mobile();
          mob.name = "Mr. Smith";
          System.out.println(mob.name);
          mob.year = 2018;
          System.out.println(mob.year);
          mob.owner ="Mr Smith";
          System.out.println(mob.owner);

          mob.mobile();

          new Mobile();
     }


     private class Brands {
          private void Brand() {
               System.out.println("Brand");

          }
     }



     private Mobile() {
          System.out.println("Mobile is addiction");
     }


     private Mobile(String name, int year, String owner) {
          this.name = name;
          this.year = year;
          this.owner = owner;

     }

     private void mobile(){
          System.out.println("Mobile is addiction");
          
          new Brands();
     }


}
