package com.example.graphql.books.controllers;

import com.example.graphql.books.dto.CreateBook;
import com.example.graphql.books.models.AuthorModel;
import com.example.graphql.books.models.BookModel;
import com.example.graphql.books.models.utils.Rating;
import com.example.graphql.books.repositories.AuthorRepository;
import com.example.graphql.books.repositories.BookRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.graphql.data.method.annotation.Argument;
import org.springframework.graphql.data.method.annotation.MutationMapping;
import org.springframework.graphql.data.method.annotation.QueryMapping;
import org.springframework.graphql.data.method.annotation.SchemaMapping;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@CrossOrigin("*")
@Controller
public class BookController {

    @Autowired
    private final BookRepository bookRepository;

    public BookController (BookRepository bookRepository) {
        this.bookRepository = bookRepository;
    }

    //SchemaMapping(typeName = "Query", value = "allBooks")
    @QueryMapping
    public List<BookModel> allBooks() {
        return bookRepository.findAll();
    }

    @QueryMapping
    public BookModel findBook(@Argument Long id) {
        return bookRepository.findById(id).get();
    }

    @MutationMapping
    public BookModel createBook(@Argument CreateBook input) {
        BookModel bookModel = new BookModel();

        bookModel.setTitle(input.title);
        bookModel.setDescription(input.description);
        bookModel.setRating(input.rating);
        bookModel.setAuthorId(input.authorId);

       var response = bookRepository.save(bookModel);

       return response;
    }
}
