package com.nejab.books.entities;

import javax.persistence.*;

@Entity
@Table(name="books")
public class Book {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int booId ;
    private String bookName;
    private String author;
    private long price;
    private String category;
    private String publications;

    public Book(){}
    public Book(int booId, String bookName, String author, long price, String category, String publications) {
        this.booId = booId;
        this.bookName = bookName;
        this.author = author;
        this.price = price;
        this.category = category;
        this.publications = publications;
    }

    public int getBooId() {
        return booId;
    }

    public void setBooId(int booId) {
        this.booId = booId;
    }

    public String getBookName() {
        return bookName;
    }

    public void setBookName(String bookName) {
        this.bookName = bookName;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public long getPrice() {
        return price;
    }

    public void setPrice(long price) {
        this.price = price;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public String getPublications() {
        return publications;
    }

    public void setPublications(String publications) {
        this.publications = publications;
    }

    @Override
    public String toString() {
        return "Book{" +
                "" + booId +
                ", '" + bookName + '\'' +
                ", '" + author + '\'' +
                ",=" + price +
                ", '" + category + '\'' +
                ", '" + publications + '\'' +
                '}';
    }
}
