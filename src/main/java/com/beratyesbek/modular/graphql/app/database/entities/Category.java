package com.beratyesbek.modular.graphql.app.database.entities;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;
import lombok.*;

import static com.beratyesbek.modular.graphql.app.database.constants.HibernateDbConstants.*;


@Getter
@Entity
@Builder
@NoArgsConstructor
@AllArgsConstructor
@Table(name = TABLE_CATEGORY)
public class Category extends AbstractEntity {

    @Column(name = COL_NAME, nullable = false)
    private String name;
}
