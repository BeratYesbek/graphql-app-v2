package com.beratyesbek.modular.graphql.app.services;

import com.beratyesbek.modular.graphql.app.database.dao.AuthorDao;
import com.beratyesbek.modular.graphql.app.database.entities.Author;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

@Service
@Transactional(propagation = Propagation.REQUIRED)
public class AuthorServiceImpl implements AuthorService {

    private final AuthorDao authorDao;

    public AuthorServiceImpl(AuthorDao authorDao) {
        this.authorDao = authorDao;
    }

    @Override
    public Author create(Author author) {
        return authorDao.save(author);
    }

    @Override
    public Author findById(int id) {
        return authorDao.findById(id).get();
    }
}
