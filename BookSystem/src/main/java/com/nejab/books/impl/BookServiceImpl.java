package com.nejab.books.impl;

import com.nejab.books.entities.Book;
import com.nejab.books.repo.BookRepository;
import com.nejab.books.services.BookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class BookServiceImpl implements BookService {

    @Autowired
    private BookRepository bookRepository;

    @Override
    public Book createBook(Book book) {

        return bookRepository.save(book);
    }

    @Override
    public List<Book> getBooks() {
        return bookRepository.findAll();
    }

    @Override
    public Book getBookById(int id) {
        Optional<Book> findById=bookRepository.findById(id);
        if(findById.isPresent()){
            return findById.get();
        }
        return null;
    }

    @Override
    public String deleteBookById(int id) {
        if(bookRepository.existsById(id)){
            bookRepository.deleteById(id);
            return "Deleted Success";
        }else {
            return "Id no Found";
        }
    }
}
