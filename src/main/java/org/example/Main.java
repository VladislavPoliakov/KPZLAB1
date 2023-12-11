package org.example;

import java.util.ArrayList;

class Book {
    public String name;
    public String author;
    public int isbn;
    public int year;

    public Book(String nm, String auth, int num, int yr){
        this.name = nm;
        this.author = auth;
        this.isbn = num;
        this.year = yr;
    }
}
public class Main {
    public static void main(String[] args) {
        ArrayList<Book> library = new ArrayList<Book>();
        library.add(new Book("Head first. Java", "Kathy Sierra", 9785699545742, 2003));

    }
}