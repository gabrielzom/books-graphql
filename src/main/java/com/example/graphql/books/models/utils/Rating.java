package com.example.graphql.books.models.utils;

public enum Rating {
    ONE_STAR(1),
    TWO_STARS(2),
    THREE_STARS(3),
    FOUR_STARS(4),
    FIVE_STARS(5);

    public final int rating;
    Rating(int value) {
        rating = value;
    }
}
