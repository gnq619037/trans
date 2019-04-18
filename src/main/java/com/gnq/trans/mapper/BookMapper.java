package com.gnq.trans.mapper;

import com.gnq.trans.entites.Book;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface BookMapper {
    void updateBook(Book book);

    Book getBook(Long id);
}
