package com.beratyesbek.modular.graphql.app.services;


import com.beratyesbek.modular.graphql.app.database.dao.BookDao;
import com.beratyesbek.modular.graphql.app.database.entities.Book;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

@Service
@Transactional(propagation = Propagation.REQUIRED)
public class BookServiceImpl implements BookService {

    private final BookDao bookDao;

    public BookServiceImpl(BookDao bookDao) {
        this.bookDao = bookDao;
    }

    @Override
    public Book create(Book book) {
        return bookDao.save(book);
    }

    @Override
    public Book findById(int id) {
        return bookDao.findById(id).get();
    }
}
