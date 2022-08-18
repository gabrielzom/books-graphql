package com.example.graphql.books.models;

import javax.persistence.*;
import java.io.Serializable;
import java.util.List;

@Entity
@Table(name = "Tab_Authors")
public class AuthorModel implements Serializable {
    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column(length = 30)
    private String name;
    @Column(length = 30)
    private String lastName;
    @OneToMany(cascade = CascadeType.ALL)
    @JoinColumn(name = "author_id")
    private List<BookModel> books;

    public Long getId() { return id; }
    public void setId(Long id) { this.id = id; }

    public String getName() { return name; }
    public void setName(String name) { this.name = name;}

    public String getLastName() { return lastName; }
    public void setLastName(String lastName) { this.lastName = lastName; }

    public List<BookModel> getBooks() { return books;}
    public void setBooks(List<BookModel> books) { this.books = books; }
}
