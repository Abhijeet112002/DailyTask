package com.tutorsdude.library;

public class LibraryRunner {

    public static void main(String[] args) {

        Libarary lib = new Libarary();

       lib.addBook("mahabhagat");
       lib.addBook("ramayan");
       lib.addBook("physics");
       lib.addBook("mathematics");
       lib.addBook("a");

       String[] libRead = lib.readAll();

        for (int i = 0; i < libRead.length; i++) {
            System.out.println(libRead[i]);
        }

    }
}
