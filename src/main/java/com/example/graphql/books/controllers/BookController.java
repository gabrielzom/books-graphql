package com.example.graphql.books.controllers;

import com.example.graphql.books.models.AuthorModel;
import com.example.graphql.books.models.BookModel;
import com.example.graphql.books.models.utils.Rating;
import com.example.graphql.books.repositories.AuthorRepository;
import com.example.graphql.books.repositories.BookRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@CrossOrigin("*")
@RestController
@RequestMapping("/books")
public class BookController {

    @Autowired
    BookRepository bookRepository;

    @Autowired
    AuthorRepository authorRepository;

    public BookController (BookRepository bookRepository, AuthorRepository authorRepository) {
        this.authorRepository = authorRepository;
        this.bookRepository = bookRepository;
    }

    @GetMapping
    public List<BookModel> getBooks() {
        return bookRepository.findAll();
    }

    @GetMapping("/authors")
    public List<AuthorModel> getAuthors() {
        return authorRepository.findAll();
    }

}
