package com.kodilla.good.patterns.challenges.excerciseNineTwo;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class ProductRepository {

    Map<Integer, String> Product = new HashMap<Integer, String>();

    public ProductRepository() {
        Product.put(100, "Xiaomi Redmi 4X");
        Product.put(12, "Rekuperator wewnątrzścienny");
        Product.put(66, "Witcher III");
    }

}
