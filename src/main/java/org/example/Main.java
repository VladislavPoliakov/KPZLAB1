package org.example;

import java.io.IOException;
import java.util.ArrayList;

class Book {
    public String name;
    public String author;
    public String isbn;
    public int year;

    public Book(String nm, String auth, String num, int yr){
        this.name = nm;
        this.author = auth;
        this.isbn = num;
        this.year = yr;
    }
}
public class Main {
    public static void main(String[] args) {
        ArrayList<Book> library = new ArrayList<Book>();
        library.add(new Book("Head first. Java", "Kathy Sierra", "9785699545742", 2003));
        library.add(new Book("Effective Java", "Joshua Bloch", "9780132345286", 2008));
        library.add(new Book("Java Concurency in Practice", "Brian Goetz", "9780321349606", 2006));
        library.add(new Book("java 8 Pocket guide", "Robert Liguory", "9785845920508", 2015));
        //menu
        bool menuExt;
        String readString;
        int readInt;
        while(!menuExt){
            System.out.println("MENU. ENTER NUMBER TO MAKE:");
            System.out.println("1.Add book");
            System.out.println("2.Show all books");
            System.out.println("3.Search by name");
            System.out.println("4.Delete by ISBN");
            try {
                readInt = System.in.readLine();
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
            switch (readInt){
                case 1: break;
                case 2: break;
                case 3: break;
                case 4: break;
                default: break;
            }

        }

    }



}