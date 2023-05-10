package com.beratyesbek.modular.graphql.app.database.entities;

import com.beratyesbek.modular.graphql.app.database.entities.enums.Popularity;
import lombok.*;

import jakarta.persistence.*;

import java.math.BigDecimal;

import static com.beratyesbek.modular.graphql.app.database.constants.HibernateDbConstants.*;


@Getter
@Entity
@Builder
@NoArgsConstructor
@AllArgsConstructor
@Table(name = TABLE_BOOK)
public class Book extends AbstractEntity {

    @Column(name = COL_NAME, nullable = false)
    private String name;

    @Column(name = COL_FORWARD, nullable = false, length = 5000)
    private String forward;

    @Column(name = COL_PRICE, nullable = false)
    private BigDecimal price;

    @Column(name = COL_RELEASE_DATE, nullable = false)
    private int releaseDate;

    @Column(name = COL_POPULARITY, nullable = false)
    private Popularity popularity;

    @Column(name = COL_PAGE_SIZE, nullable = false)
    private int pageSize;

}
