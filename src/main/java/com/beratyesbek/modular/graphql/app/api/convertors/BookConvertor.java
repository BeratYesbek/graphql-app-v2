package com.beratyesbek.modular.graphql.app.api.convertors;


import com.beratyesbek.modular.graphql.app.api.dom.book.BookCreateRequest;
import com.beratyesbek.modular.graphql.app.api.dom.book.BookReadRequest;
import com.beratyesbek.modular.graphql.app.database.entities.Book;

public final class BookConvertor {
    private BookConvertor() {

    }

    public static BookReadRequest convertBookToBookReadRequest(Book book) {
        return BookReadRequest.builder()
                .id(book.getId())
                .name(book.getName())
                .price(book.getPrice())
                .releaseDate(book.getReleaseDate())
                .pageSize(book.getPageSize())
                .popularity(book.getPopularity())
                .forward(book.getForward())
                .createdAt(book.getCreatedAt())
                .build();
    }

    public static Book convertBookCreateRequestToBook(BookCreateRequest bookCreateRequest) {
        return Book.builder()
                .price(bookCreateRequest.getPrice())
                .releaseDate(bookCreateRequest.getReleaseDate())
                .popularity(bookCreateRequest.getPopularity())
                .pageSize(bookCreateRequest.getPageSize())
                .name(bookCreateRequest.getName())
                .forward(bookCreateRequest.getForward())
                .build();
    }
}
