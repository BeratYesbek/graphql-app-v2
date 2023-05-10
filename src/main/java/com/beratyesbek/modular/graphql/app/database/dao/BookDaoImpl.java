package com.beratyesbek.modular.graphql.app.database.dao;

import com.beratyesbek.modular.graphql.app.api.dom.filters.BookFilterRequest;
import com.beratyesbek.modular.graphql.app.database.entities.Book;
import jakarta.persistence.EntityManager;
import jakarta.persistence.criteria.CriteriaBuilder;
import jakarta.persistence.criteria.CriteriaQuery;
import jakarta.persistence.criteria.Predicate;
import jakarta.persistence.criteria.Root;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;

@Repository
public class BookDaoImpl implements CustomBookDao {

    private final EntityManager entityManager;
    private CriteriaBuilder builder;

    public BookDaoImpl(EntityManager entityManager) {
        this.entityManager = entityManager;
    }


    @Override
    public List<Book> findByCriteria(BookFilterRequest filter) {
        builder = entityManager.getCriteriaBuilder();
        CriteriaQuery<Book> query = builder.createQuery(Book.class);

        Root<Book> bookRoot = query.from(Book.class);
        List<Predicate> predicates = new ArrayList<>();
        filter(filter, predicates, bookRoot);

        query.where(predicates.toArray(new Predicate[0]));
        return entityManager.createQuery(query).getResultList();
    }

    private void filter(final BookFilterRequest filter, final List<Predicate> predicates, final Root<Book> bookRoot) {
        if (filter.getName() != null)
            predicates.add(builder.equal(bookRoot.get("name"), filter.getName()));
        if (filter.getPrice() != null)
            predicates.add(builder.equal(bookRoot.get("price"), filter.getPrice()));
        if (filter.getForward() != null)
            predicates.add(builder.like(bookRoot.get("forward"), "%" + filter.getForward() + "%"));
        if (filter.getPopularity() != null)
            predicates.add(builder.equal(bookRoot.get("popularity"), filter.getPopularity()));
        if (filter.getReleaseDate() != 0)
            predicates.add(builder.equal(bookRoot.get("releaseDate"), filter.getReleaseDate()));
        if (filter.getPageSize() != 0)
            predicates.add(builder.equal(bookRoot.get("pageSize"), filter.getPageSize()));
    }
}
