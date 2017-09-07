package com.kodilla.testing.forum.statistics;

import java.util.ArrayList;

public class AdvStatistics {
    //dodać constructor gettery, zmienić pola na prywatne
    public AdvStatistics(int numberOfUsers, int numberOfPosts, int numberOfComments, int avgNumberOfCommentsPerUser, int avgNumberOfCommentsPerPost) {
        this.numberOfUsers = numberOfUsers;
        this.numberOfPosts = numberOfPosts;
        this.numberOfComments = numberOfComments;
        this.avgNumberOfCommentsPerUser = avgNumberOfCommentsPerUser;
        this.avgNumberOfCommentsPerPost = avgNumberOfCommentsPerPost;
    }

    public int getNumberOfUsers() {
        return numberOfUsers;
    }

    public int getNumberOfPosts() {
        return numberOfPosts;
    }

    public int getNumberOfComments() {
        return numberOfComments;
    }

    public int getAvgNumberOfCommentsPerUser() {
        return avgNumberOfCommentsPerUser;
    }

    public int getAvgNumberOfCommentsPerPost() {
        return avgNumberOfCommentsPerPost;
    }

    private int numberOfUsers;
    private int numberOfPosts;
    private int numberOfComments;
    private int avgNumberOfCommentsPerUser;
    private int avgNumberOfCommentsPerPost;

    public void calculateAdvStatistics(Statistics statistics){
        numberOfUsers = statistics.usersNames().size();
        numberOfPosts = statistics.postsCount();
        numberOfComments = statistics.commentsCount();
        avgNumberOfCommentsPerUser = statistics.commentsCount()/statistics.usersNames().size();
        avgNumberOfCommentsPerPost = statistics.commentsCount()/statistics.postsCount();
    }

    public void ShowStatistics(){
        System.out.println("Number of Users " + numberOfUsers);
        System.out.println("Number of Posts" + numberOfPosts);
        System.out.println("Number of Comments" + numberOfComments);
        System.out.println("Avg number of Comments per User " + avgNumberOfCommentsPerUser);
        System.out.println("Avg number of Comments per Post" + avgNumberOfCommentsPerPost);
    }
}

