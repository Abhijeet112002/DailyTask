package com.tutorsdude.hospital.Hospital;

public class hospital {

    public String hospitalName;
    public String ceoName;


    public Department[] dept ;
    public Doctor[] doc;
    public Patient[] patient;
    public Address add;

    public void printall(){
        System.out.println("Hospital Name: " + hospitalName);
        System.out.println("department;" + dept);
        System.out.println("ceoName;" + ceoName);
        System.out.println("doctor;" + doc);
        System.out.println("patient;" + patient);
        System.out.println("address;" + add);

       for(int i=0; i< dept.length; i++){
           dept[i].printall();
       }

        for (int i=0; i<doc.length; i++){
            doc[i].printall();
        }
        for (int i=0; i<patient.length; i++){
            patient[i].printall();
        }

        add.printall();

    }

}
