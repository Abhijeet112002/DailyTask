package com.tutorsdude.PublicEx.ProtectedEx;

public class Application extends Software{
    protected String name;
    protected String description;
    protected String owner;

    protected static void application(){
        System.out.println("Application");

    }

    protected Application(){
        System.out.println("Application");

    }

    protected Application(String name, String description, String owner){
        this.name = name;
        this.description = description;
        this.owner = owner;

    }

    public static void main(String[] args) {
        Application application = new Application();
        application.name = "whatsapp";
        System.out.println(application.name);
        application.description = "Whatsapp";
        System.out.println(application.description);
        application.owner = "TutorsDude";
        System.out.println(application.owner);

        Application.application();

        new Application();

        Software software = new Software();
        software.name = "Software";
        System.out.println(software.name);
        software.creater = "xyz";
        System.out.println(software.creater);
        software.year = 2020;
        System.out.println(software.year);

        Software.software();

        new Software();



    }
}
