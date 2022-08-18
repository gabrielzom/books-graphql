package com.example.graphql.books.repositories;

import com.example.graphql.books.models.AuthorModel;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AuthorRepository extends JpaRepository<AuthorModel, Long> {
}
