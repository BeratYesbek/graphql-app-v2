package com.beratyesbek.modular.graphql.app.database.entities;


import org.hibernate.annotations.CreationTimestamp;

import java.io.Serializable;
import java.time.LocalDate;

import lombok.Getter;
import lombok.Setter;

import jakarta.persistence.*;

import static com.beratyesbek.modular.graphql.app.database.constants.HibernateDbConstants.*;

@Getter
@Setter
@MappedSuperclass
public abstract class AbstractEntity implements Serializable {

    private static final boolean DEFAULT_DELETED_VALUE = false;

    @Id
    @Column(name = COL_ID)
    @Access(AccessType.PROPERTY)
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    protected int id;

    @Column(name = COL_CREATED_AT, nullable = false)
    @CreationTimestamp
    protected LocalDate createdAt;

    @Column(name = COL_DELETED, nullable = false)
    protected boolean deleted = DEFAULT_DELETED_VALUE;

}
