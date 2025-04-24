package com.tutorsdude.CurdOperartion;

public class CurdRunner {

   static String[] carName = new String[12];
   static String[] countryName = new String[8];

    public static void main(String[] args) {

        cars("ferrai");
        cars("lambo");
        cars("dukati");

        country("india");
        country("pakistan");
        country("bangladesh");

        for(int i= 0; i<carName.length;i++){
            System.out.println(carName[i]);
        }
        for(int i= 0; i<carName.length;i++){
            System.out.println(countryName[i]);
        }

        String[] returnedArr = readAll();
        for(int i=0; i< returnedArr.length; i++){
            System.out.println(returnedArr);
        }


    }

    public static void cars(String name){
        for(int i= 0; i<carName.length;i++){
           if(carName[i]==null){
               carName[i] = name;
               return;

           }
        }
    }

    public static void country(String names){
        for(int i= 0; i<countryName.length;i++){ // loops for adding multiple places
            if(countryName[i]==null){ // check for blank
                countryName[i] = names; //
                return;
            }
        }
    }

    public static String[] readAll(){
        return carName;
    }
}
