package com.tutorsdude.hospital.Hospital;

public class Patient {

    public String name;
    public Disease[] disease;
    public int age;
    public PatientAddress[] patientaddress;

    public void printall(){
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);


     if(disease!= null){
         for(int i=0; i<disease.length; i++){
             if(disease!=null){
                 disease[i].printall();
             }
         }
     }

     if(patientaddress!=null){
         for(int i=0; i< patientaddress.length; i++){
             if(patientaddress!=null){
                 patientaddress[i].printall();
             }
         }
     }






    }


}
