package com.kodilla.stream.forumuser;

import java.time.LocalDate;

public final class ForumUser {
    private final int userId;
    private final String userName;
    private final char sex;
    private final LocalDate dateOfBirth;
    private final int postsCount;

    public int getPostsCount() {
        return postsCount;
    }


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

    public ForumUser(int userId, String userName, char sex, int year, int month, int day, int postsCount) {
        this.userId = userId;
        this.userName = userName;
        this.sex = sex;
        this.dateOfBirth = LocalDate.of(year, month, day);
        this.postsCount = postsCount;
    }

    @Override
    public String toString(){
        return  "Forum User " + userName + ", user ID : " + userId + ", sex: " + sex + ", date of birth " + dateOfBirth + "number of posts " + postsCount;
    }

}




