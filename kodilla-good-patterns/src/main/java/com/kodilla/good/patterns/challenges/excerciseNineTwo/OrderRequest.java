package com.kodilla.good.patterns.challenges.excerciseNineTwo;

import com.sun.org.apache.xpath.internal.operations.String;

public class OrderRequest {

    public User user;
    public String productName;
    public int productQuantity;

    public OrderRequest(final User user, String productName, int productQuantity) {
        this.user = user;
        this.productName = productName;
        this.productQuantity = productQuantity;
    }

    public User getUser() {
        return user;
    }

    public String getProductName() {
        return productName;
    }

    public int getProductQuantity() {
        return productQuantity;
    }
}
