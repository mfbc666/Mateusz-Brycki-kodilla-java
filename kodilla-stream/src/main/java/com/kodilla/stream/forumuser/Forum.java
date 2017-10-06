package com.kodilla.stream.forumuser;

import java.time.Month;
import java.util.ArrayList;
import java.util.List;

public class Forum {
    private final List<ForumUser> forumUser = new ArrayList<>();

    public Forum() {
        forumUser.add(new ForumUser(1,"Dylan",'M',2009,11,12,200));
        forumUser.add(new ForumUser(2,"Bob",'M',2012,2,22,6565));
        forumUser.add(new ForumUser(3,"Oprah",'F',2012,10,4,12));
        forumUser.add(new ForumUser(4,"Spitygniew",'M',2016,5,1,12472));
        forumUser.add(new ForumUser(5,"Swidrygiello",'M',1309,6,12,66));
        forumUser.add(new ForumUser(6,"Rus",'M',700,6,30,314));

    }

    public List<ForumUser> getUserList(){

        return new  ArrayList<ForumUser>(forumUser);
    }


}
