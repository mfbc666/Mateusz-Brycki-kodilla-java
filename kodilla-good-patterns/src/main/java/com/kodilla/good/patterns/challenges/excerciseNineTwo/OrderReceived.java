package com.kodilla.good.patterns.challenges.excerciseNineTwo;

public class OrderReceived {

    public OrderRequest receive(){

        User user = new User("Mateusz","Brycki","buziaczek@pudelek.pl");
        String productName = "lenovo Thinkpad T510";
        int productQuantity = 1;

        return new OrderRequest(user,productName, productQuantity );
    }
}
