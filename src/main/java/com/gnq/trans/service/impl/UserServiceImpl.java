package com.gnq.trans.service.impl;

import com.gnq.trans.entites.Book;
import com.gnq.trans.entites.User;
import com.gnq.trans.mapper.BookMapper;
import com.gnq.trans.mapper.UserMapper;
import com.gnq.trans.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

/**
 * @author: guonanqing
 * @desc:
 * @date:
 */
@Service
public class UserServiceImpl implements UserService {
    @Autowired
    private UserMapper userMapper;

    @Autowired
    private BookMapper bookMapper;

    @Transactional(propagation = Propagation.NEVER)
    @Override
    public void addUser(User user) {

        userMapper.updateBookSum(user);
        Book book = bookMapper.getBook(1L);
        book.setBookSum(book.getBookSum() - user.getBookSum());
        bookMapper.updateBook(book);

    }
}
