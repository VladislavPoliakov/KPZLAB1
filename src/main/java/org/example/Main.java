package org.example;

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
    }
}