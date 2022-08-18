package com.example.graphql.books.dto;
import com.example.graphql.books.models.utils.Rating;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class CreateBook {
    public String title;
    public String description;
    public Rating rating;
    public Long authorId;
}
