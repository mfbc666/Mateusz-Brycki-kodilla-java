package com.kodilla.stream.forumuser;

import java.time.LocalDate;

public final class ForumUser {
    private final int userId;
    private final String userName;
    private final char sex = 'M'/'F';

    public int getUserId() {
        return userId;
    }

    public String getUserName() {
        return userName;
    }

    public char getSex() {
        return sex;
    }

    public LocalDate getDateOfBirth() {
        return dateOfBirth;
    }

    public int getYear() {
        return year;
    }

    public int getMonth() {
        return month;
    }

    public int getDay() {
        return day;
    }

    private final LocalDate dateOfBirth = LocalDate.now();
    int year = dateOfBirth.getYear();
    int month = dateOfBirth.getMonthValue();
    int day = dateOfBirth.getDayOfMonth();

    public ForumUser(int userId, String userName, char sex, int year, int month, int day) {
        this.userId = userId;
        this.userName = userName;
        //this.sex = sex;
        this.year = year;
        this.month = month;
        this.day = day;
    }

    @Override
    public String toString(){

        return  "Forum User " + userName + ", user ID : " + userId + ", sex: " + sex + ", date of birth " + dateOfBirth;
    }
}




