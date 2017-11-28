package com.kodilla.good.patterns.challenges.excerciseNineTwo;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class ProductRepository {

    Map<String, Integer> Product = new HashMap<String, Integer>();

    public ProductRepository() {
        Product.put("Xiaomi Redmi 4X", 100);
        Product.put("Rekuperator wewnątrzścienny", 12);
        Product.put("Witcher III",22);
    }

}
