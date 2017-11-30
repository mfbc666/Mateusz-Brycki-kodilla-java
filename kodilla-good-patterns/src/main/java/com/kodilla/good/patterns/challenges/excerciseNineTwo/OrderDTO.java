package com.kodilla.good.patterns.challenges.excerciseNineTwo;

import com.sun.org.apache.xpath.internal.operations.String;

public class OrderDTO {
    public User user;
    public boolean isSold;

    public OrderDTO(final User user, boolean isSold) {
        this.user = user;

    }

    public User getUser() {
        return user;
    }

    public boolean isSold(){
        return isSold;
    }
}

