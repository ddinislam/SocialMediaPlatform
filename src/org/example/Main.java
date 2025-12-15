package org.example;

public class Main {
    public static void main(String[] args) {

        User user1 = new User(1, "dinislam", "dinislamumirbaev@mail.com");
        User user2 = new User(2, "Babajon", "Babajon111@mail.com");

        System.out.println("user1 equals user2? " + user1.equals(user2));


        Post post1 = new Post(1, "Hi, this is my first post", user1);
        Post post2 = new Post(2, "I learn OOP in AITU ", user2);

        SocialMedia socialMedia = new SocialMedia("MySocialApp");

        socialMedia.publishPost(post1);
        socialMedia.publishPost(post2);

        System.out.println(user1);
        System.out.println(user2);
        System.out.println(post1);
        System.out.println(post2);
    }
}