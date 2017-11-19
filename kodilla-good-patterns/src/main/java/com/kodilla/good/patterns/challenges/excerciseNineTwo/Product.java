package com.kodilla.good.patterns.challenges.excerciseNineTwo;

public class Product {

    private final String productName;
    private final int productQuantity;

    public Product(String productType, String productName, int productQuantity) {

        this.productName = productName;
        this.productQuantity = productQuantity;
    }

    public String getProductName() {
        return productName;
    }

    public int getProductQuantity() {
        return productQuantity;
    }

    public Product(String productName, int productQuantity) {

    }
}
