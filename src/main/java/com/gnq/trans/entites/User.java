package com.gnq.trans.entites;

import java.io.Serializable;

/**
 * @author: guonanqing
 * @desc:
 * @date:
 */
public class User implements Serializable{
    private Long id;
    private String name;
    private Long bookSum;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Long getBookSum() {
        return bookSum;
    }

    public void setBookSum(Long bookSum) {
        this.bookSum = bookSum;
    }
}
