package com.example.graphql.books.models;

import com.example.graphql.books.models.utils.Rating;

import javax.persistence.*;
import java.io.Serializable;

@Entity
@Table(name = "Tab_Books")
public class BookModel implements Serializable {

    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(length = 80)
    private String title;

    @Column(length = 300)
    private String description;

    @Column(name = "rating") @Enumerated(value = EnumType.STRING)
    private Rating rating;

    @Column(name = "author_id")
    public Long authorId;

    public Long getAuthorId() {
        return authorId;
    }

    public void setAuthorId(Long authorId) {
        this.authorId = authorId;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public int getRating() {
        return rating.ordinal();
    }

    public void setRating(Rating rating) {
        this.rating = rating;
    }



    @Override
    public String toString() {
        return "BooksModel{" +
                "id=" + id +
                ", title='" + title + '\'' +
                ", description='" + description + '\'' +
                ", rating=" + rating +
                '}';
    }
}
