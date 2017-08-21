package com.kodilla;

import java.util.*;
import java.lang.*;


/* Name of the class has to be "Main" only if the class is public. */

class Book {

    String title = "";
    String author ="";

    public Book(String title, String author){
        this.title = title;
        this.author = author;
    }

    public boolean equals(Object o){

        final Book b = (Book) o;
        return this.title.equals(b.title) && this.author.equals(b.author);
    }

    public String getTitle() {
        return title;
    }

    public String getAuthor() {
        return author;
    }
    /*public int hashCode(){
        return Book.hash(title,author);
    }*/


}
class BooksCollectionCreate {

    public static void main(String[] args) {


        LinkedList<Book> booksCollection = new LinkedList<>();
        HashMap<Integer,Integer> hashMap = new HashMap<Integer, Integer>();
        for(int n = 0; n < 2000000; n++){
            booksCollection.add(new Book("title" +n,"author" +n));
            hashMap.put(n,n);
// Part 1
        }
        long begin0 = System.currentTimeMillis();
        booksCollection.removeFirstOccurrence(booksCollection);
        long end0 = System.currentTimeMillis();

        long begin1 = System.currentTimeMillis();
        booksCollection.removeLastOccurrence(booksCollection);
        long end1 = System.currentTimeMillis();

        long begin2 = System.nanoTime();
        booksCollection.addFirst(new Book("title","author"));
        long end2 = System.nanoTime();


        System.out.println("Time of removing first occurence Linkedlist in mills : " + (end0-begin0));
        System.out.println("Time of removing last occurence Linkedlist in mills : " + (end1-begin1));
        System.out.println("Time of adding first occurence Linkedlist in nano : " + (end2-begin2));
// Part 2
        long begin3 = System.nanoTime();
        hashMap.put(2000001,2000001);
        long end3 = System.nanoTime();

        long begin4 = System.nanoTime();
        hashMap.remove(2000001,2000001);
        long end4 = System.nanoTime();

        long begin5 = System.nanoTime();
        hashMap.get(1);
        long end5 = System.nanoTime();

        System.out.println("Time of adding one occurence HashMap in nano : " + (end3-begin3));
        System.out.println("Time of removing one occurence HashMap in nano : " + (end4-begin4));
        System.out.println("Time of searching one occurence HashMap in nano : " + (end5-begin5));


    }

}