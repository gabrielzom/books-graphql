package com.example.graphql.books.repositories;

import com.example.graphql.books.models.BookModel;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BookRepository extends JpaRepository<BookModel, Long> {
}
