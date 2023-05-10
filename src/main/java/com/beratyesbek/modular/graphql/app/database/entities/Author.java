package com.beratyesbek.modular.graphql.app.database.entities;

import com.beratyesbek.modular.graphql.app.database.entities.enums.Reputation;

import static com.beratyesbek.modular.graphql.app.database.constants.HibernateDbConstants.*;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;
import lombok.*;
@Getter
@Entity
@Builder
@NoArgsConstructor
@AllArgsConstructor
@Table(name = TABLE_AUTHOR)
public class Author extends AbstractEntity {

    @Column(name = COL_NAME, nullable = false)
    private String name;

    @Column(name = COL_AGE, nullable = false)
    private int age;

    @Column(name = COL_REPUTATION, nullable = false)
    private Reputation reputation;
}
