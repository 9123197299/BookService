package com.nejab.books.controllers;

import com.nejab.books.entities.Book;
import com.nejab.books.services.BookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class BookController {

    @Autowired
    private BookService bookService;

    @PostMapping("/books")
    public ResponseEntity<Book> createBook(@RequestBody Book book){
       Book status = bookService.createBook(book);
       return new ResponseEntity<>(status, HttpStatus.CREATED);
    }

    @GetMapping("/books")
    public ResponseEntity<List<Book>> getAll(){
      List<Book> books=bookService.getBooks();
      return new ResponseEntity<>(books,HttpStatus.OK);
    }

    @GetMapping("/books/{id}")
    public ResponseEntity<Book> getBook(@PathVariable Integer id){
        Book book=bookService.getBookById(id);
        return new ResponseEntity<>(book,HttpStatus.OK);
    }

    @DeleteMapping("/books/{id}")
    public ResponseEntity<String> deleteBook(@PathVariable Integer id){
        String status=bookService.deleteBookById(id);
        return new ResponseEntity<>(status,HttpStatus.OK);
    }

    @PutMapping("/update")
    public ResponseEntity<Book> updateBook(@RequestBody Book book){
        Book status = bookService.createBook(book);
        return new ResponseEntity<>(status, HttpStatus.OK);
    }
}
