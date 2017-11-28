package com.kodilla.good.patterns.challenges.excerciseNineTwo;

public class ProductQuantity {

    private final Integer quantity;

    public ProductQuantity(Product product, Integer quantity){

        this.quantity = quantity;

    }
    public Integer getQuantity() {
        return quantity;
    }

}

