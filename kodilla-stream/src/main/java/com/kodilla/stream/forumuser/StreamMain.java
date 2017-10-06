package com.kodilla.stream.forumuser;

public class StreamMain {
    public static void main(String[] args) {
        Forum forum = new Forum();
        forum.getUserList().stream();
                .filter(s -> s.)

                 /*
                .map(String::toUpperCase)
                .filter(s -> s.length() > 11)
                .map(s -> s.substring(0, s.indexOf(' ') + 2) + ".")
                .filter(s -> s.substring(0, 1).equals("M"))
                .forEach(System.out::println);
                */

    }
}
