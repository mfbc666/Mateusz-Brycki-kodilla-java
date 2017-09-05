package com.kodilla.testing.forum.statistics;

import java.util.ArrayList;


public class AdvStatistics {
    int countUsers;
    int postsCount;
    int commentsCount;

    public ArrayList<String> userNames(){
        ArrayList<String> userNames = new ArrayList<String>();
        userNames.size() = countUsers;
        return countUsers;
    }

    int postsCount(){
        this.postsCount = postsCount;
        return this.postsCount;
    }

    int commentsCount(){
        this.commentsCount = commentsCount;
        return this.commentsCount;
    }

    int avgPostsPerUser(){
        return this.postsCount / userNames().size();
    }

    int avgCommentsPerUser(){
        return this.commentsCount / userNames().size();
    }

    int avgCommentsPerPost(){
        return this.commentsCount / this.postsCount;
    }

    public void calculateAdvStatistics(Statistics statistics){



    }

}

