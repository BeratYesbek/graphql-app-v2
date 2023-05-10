package com.beratyesbek.modular.graphql.app.api.dom.book;

import com.beratyesbek.modular.graphql.app.database.entities.enums.Popularity;
import lombok.Builder;
import lombok.Getter;
import lombok.Setter;

import java.math.BigDecimal;
import java.time.LocalDate;

@Getter
@Setter
@Builder
public class BookReadRequest {
    private int id;
    private String name;
    private String forward;
    private BigDecimal price;
    private int releaseDate;
    private Popularity popularity;
    private int pageSize;
    private LocalDate createdAt;
}
