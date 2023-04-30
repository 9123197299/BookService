package com.nejab.books.services;

import com.nejab.books.entities.Book;

import java.util.List;

public interface BookService {

    public Book createBook(Book book);

    public List<Book> getBooks();

    public Book getBookById( int id);

    public String deleteBookById(int id);
}
