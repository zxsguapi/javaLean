package com.ssm.service.impl;

import com.ssm.dao.BookDao;
import com.ssm.domain.Books;
import com.ssm.service.BookService;
import org.springframework.stereotype.Service;

import java.util.List;

public class BookServiceImpl implements BookService {

    //调用dao层的操作，设置一个set接口，方便Spring管理
    private BookDao bookDao;

    public void setBookDao(BookDao bookDao) {
        this.bookDao = bookDao;
    }

    public int addBook(Books book) {
        return bookDao.addBook(book);
    }

    public int deleteBookById(int id) {
        return bookDao.deleteBookById(id);
    }

    public int updateBook(Books books) {
        return bookDao.updateBook(books);
    }

    public Books queryBookById(int id) {
        return bookDao.queryBookById(id);
    }

    public List<Books> queryAllBook() {
        return bookDao.queryAllBook();
    }
}
