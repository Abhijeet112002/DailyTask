package com.tutorsdude.PublicEx.ProtectedEx;

public class Software {
    protected String name;
    protected String creater;
    protected int year;

    protected static void software(){
        System.out.println("Software");

    }
    protected Software(){
        System.out.println("Software");
    }

    protected Software(String name, String creater, int year){
        this.name = name;
        this.creater = creater;
        this.year = year;

    }

    public static void main(String[] args) {
        Software software = new Software();
        software.name = "Software";
        System.out.println(software.name);
        software.creater = "xyz";
        System.out.println(software.creater);
        software.year = 2020;
        System.out.println(software.year);

        Software.software();

        new Software();

        Application application = new Application();
        application.name = "whatsapp";
        System.out.println(application.name);
        application.description = "Whatsapp";
        System.out.println(application.description);
        application.owner = "TutorsDude";
        System.out.println(application.owner);

        Application.application();

        new Application();

    }
}
