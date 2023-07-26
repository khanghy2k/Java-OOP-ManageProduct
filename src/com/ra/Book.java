package com.ra;

import java.util.Comparator;

public class Book implements  Comparable<Book>, Comparator<Book> {
    private String id;
    private String title;
    private double price;
    private String author;
    public Book() {

    }

    public Book(String id, String title, double price, String author) {
        this.id = id;
        this.title = title;
        this.price = price;
        this.author = author;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    @Override
    public int compareTo(Book o) {
        //return Double.compare(this.price,o.getPrice());
        return this.title.compareTo(o.getTitle());
    }

    @Override
    public int compare(Book o1, Book o2) {
        return o1.getTitle().compareTo(o2.getTitle());
    }
}
