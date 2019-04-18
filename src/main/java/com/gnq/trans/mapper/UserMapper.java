package com.gnq.trans.mapper;

import com.gnq.trans.entites.User;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface UserMapper {
    void insertUser(User user);

    void updateBookSum(User user);
}
