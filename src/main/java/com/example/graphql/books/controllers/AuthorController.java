package com.example.graphql.books.controllers;

import com.example.graphql.books.models.AuthorModel;
import com.example.graphql.books.repositories.AuthorRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.graphql.data.method.annotation.QueryMapping;
import org.springframework.stereotype.Controller;

import java.util.List;

@Controller
public class AuthorController {
    @Autowired
    private final AuthorRepository authorRepository;

    public AuthorController (AuthorRepository authorRepository) {
        this.authorRepository = authorRepository;
    }

    //SchemaMapping(typeName = "Query", value = "allAuthors")
    @QueryMapping
    public List<AuthorModel> allAuthors() {
        return authorRepository.findAll();
    }
}
