package org.example;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        User user1 = new User(1, "dinislam", "dinislam@mail.com");
        User user2 = new User(2, "Babajon", "babajon@mail.com");

        System.out.println("user1 equals user2? " + user1.equals(user2));

        SocialMedia socialMedia = new SocialMedia("MySocialApp");

        Post post1 = new Post(1, "Hello, this is my first post", user1);
        Post post2 = new Post(2, "I learn OOP in AITU", user2);

        socialMedia.publishPost(post1);
        socialMedia.publishPost(post2);

        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter new post content: ");
        String text = scanner.nextLine();

        Post userPost = new Post(3, text, user1);
        socialMedia.publishPost(userPost);

        scanner.close();
    }
}
