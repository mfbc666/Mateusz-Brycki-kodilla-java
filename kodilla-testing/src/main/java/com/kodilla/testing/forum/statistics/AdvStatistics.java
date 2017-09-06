package com.kodilla.testing.forum.statistics;

import java.util.ArrayList;


public class AdvStatistics {

    int numberOfUsers;
    int numberOfPosts;
    int numberOfComments;
    int avgNumberOfCommentsPerUser;
    int avgNumberOfCommentsPerPost;

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

