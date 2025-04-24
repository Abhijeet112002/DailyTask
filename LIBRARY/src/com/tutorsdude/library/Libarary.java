package com.tutorsdude.library;

public class Libarary {

    String[] book = new String[7];

    public void addBook(String name){
        if(book!=null && name.length()>= 2){
            for(int i = 0; i<name.length();i++){
                if(book[i]==null){
                    book[i] = name;
                    System.out.println("Book Name : " + name);
                    return;
                }
                else {
                    System.out.println("Index Occupied move to Next one");
                }
            }
            System.out.println("Space is Over");
        }
        else{
            System.out.println("Library Not Valid");
        }

    }

    public String[] readAll(){
        return book;
    }
}
