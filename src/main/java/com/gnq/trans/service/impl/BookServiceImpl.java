package com.gnq.trans.service.impl;

import com.gnq.trans.entites.Book;
import com.gnq.trans.mapper.BookMapper;
import com.gnq.trans.service.BookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @author: guonanqing
 * @desc:
 * @date:
 */
@Service
public class BookServiceImpl implements BookService {
    @Autowired
    private BookMapper bookMapper;

    @Override
    public void updateSum(Book book) {
        bookMapper.updateBook(book);
    }
}
