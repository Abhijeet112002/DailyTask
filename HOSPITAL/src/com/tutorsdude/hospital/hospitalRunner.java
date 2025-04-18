package com.tutorsdude.hospital;

import com.tutorsdude.hospital.Hospital.*;

public class hospitalRunner {

    public static void main(String[] args) {

       hospital hos1 = new hospital();
       hos1.hospitalName = "government hospital gangavathi";
       System.out.println(hos1.hospitalName);
       hos1.ceoName = "Dr.joseph";

       Department d1 = new Department();
       d1.departmentName = "dental";
       d1.chiefDoctorName = "dr.shankaru";
       d1.departmentId = 1;

       Department d2 = new Department();
       d2.departmentName = "ayurvedic";
       d2.chiefDoctorName = "dr.mohan";
       d2.departmentId = 2;

       Department d3 = new Department();
       d3.departmentName = "general";
       d3.chiefDoctorName = "dr.madhusudhan";
       d3.departmentId = 3;

       Department d4 = new Department();
       d4.departmentName = "dental";
       d4.chiefDoctorName = "dr.shankaru";
       d4.departmentId = 1;


       Department[] deptArray = { d1, d2, d3, d4};
       hos1.dept = deptArray;





       Doctor doc1 = new Doctor();
       doc1.name = "dr.abhi";
       doc1.noOfOperation = 5;
       doc1.specializedIn = "surgen";

       Doctor doc2 = new Doctor();
       doc2.name = "dr.manju";
       doc2.noOfOperation = 7;
       doc2.specializedIn = "clining";

       Doctor doc3 = new Doctor();
       doc3.name = "dr.siddu";
       doc3.noOfOperation =15;
       doc3.specializedIn = "xyz";

       Doctor doc4 = new Doctor();
       doc4.name = "dr.altaf";
       doc4.noOfOperation = 25;
       doc4.specializedIn = "specialist";

       Doctor doc5 = new Doctor();
       doc1.name = "dr.abhi";
       doc1.noOfOperation = 25;
       doc1.specializedIn = "surgendwwdw";

       Doctor[] doctors = {doc1, doc2, doc3, doc4, doc5};
       hos1.doc = doctors;
       hos1.printall();

       Patient p1 = new Patient();
       p1.name = "mahadev";
       p1.age = 50;
       PatientAddress pa1 = new PatientAddress();
       pa1.name = "pati";
       pa1.area = "jayanagar";
       pa1.city = "gangavathi";
       pa1.pinCode = 583227;

       Disease dis1 = new Disease();
       dis1.name = "cold";
       dis1.cause = "virus";
       dis1.seviority = "medium";

       Patient p2 = new Patient();
       p2.name = "mahadev";
       p2.age = 50;
       PatientAddress pa2 = new PatientAddress();
       pa2.name = "pati";
       pa2.area = "jayagar";
       pa2.city = "gangavathi2";
       pa2.pinCode = 583247;

       Disease dis2 = new Disease();
       dis2.name = "cold2";
       dis2.cause = "virus2";
       dis2.seviority = "medium2";

       Patient p3 = new Patient();
       p3.name = "mahadev";
       p3.age = 50;
       PatientAddress pa3 = new PatientAddress();
       pa3.name = "pati3";
       pa3.area = "jayanagar3";
       pa3.city = "gangavathi3";
       pa3.pinCode = 5832273;

       Disease dis3 = new Disease();

       dis3.name = "cold";
       dis3.cause = "virus";
       dis3.seviority = "medium";

       Patient[] patientArray ={p1,p2,p3};
       PatientAddress[] patientAddresses = { pa1,pa2,pa3};
       Disease[] diseases = {dis1,dis2,dis3};

       hos1.patient = patientArray;





      



       Address ad1 = new Address();
       hos1.add = ad1;
       ad1.area = "pampanagar";
       ad1.city = "koppal";
       ad1.pinCode = 583327;
       ad1.name = "dhjsd";

       hos1.printall();






        //.........................................................................................


















    }
}
