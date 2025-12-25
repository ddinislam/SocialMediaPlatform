package org.example;

import java.util.ArrayList;
import java.util.List;

public class SocialMedia {
    private String platformName;
    private List<Post> posts = new ArrayList<>();

    public SocialMedia(String platformName) {
        this.platformName = platformName;
    }

    public void publishPost(Post post) {
        posts.add(post);
        System.out.println("Published on " + platformName + ": " + post);
    }

    public Post findPostById(int id) {
        for (Post post : posts) {
            if (post.getId() == id) {
                return post;
            }
        }
        return null;
    }

    public List<Post> filterPostsByUser(User user) {
        List<Post> result = new ArrayList<>();
        for (Post post : posts) {
            if (post.getAuthor().equals(user)) {
                result.add(post);
            }
        }
        return result;
    }

    public void sortPostsById() {
        posts.sort((p1, p2) -> Integer.compare(p1.getId(), p2.getId()));
    }
}
