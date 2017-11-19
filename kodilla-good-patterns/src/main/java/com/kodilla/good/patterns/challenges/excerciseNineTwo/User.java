package com.kodilla.good.patterns.challenges.excerciseNineTwo;

public class User {

    private String userName;
    private String userSurname;
    private String userEmail;

    public User(final String userName, final String userSurname, final String userEmail) {
        this.userName = userName;
        this.userSurname = userSurname;
        this.userEmail = userEmail;
    }

    public String getUserName() {
        return userName;
    }

    public String getUserSurname() {
        return userSurname;
    }

    public String getUserEmail() {
        return userEmail;
    }
}
