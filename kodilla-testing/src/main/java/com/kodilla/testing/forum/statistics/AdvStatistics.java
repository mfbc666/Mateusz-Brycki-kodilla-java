package com.kodilla.testing.forum.statistics;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class AdvStatistics implements Statistics {


/*    List<String> usersNames(); // list of users names
    int postsCount();          // total quantity of forum posts
    int commentsCount();       // total quantity of forum comments
    */


    class calculateAdvStatistics{
        private int countUsers;
        private int postsCount;
        private int commentsCount;


        List<String> userNames(){
            List<String> userNames = new ArrayList<String>();
            return usersNames();
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




    }
}
