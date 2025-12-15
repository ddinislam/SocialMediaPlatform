package org.example;

public class Post {
    private int id;
    private String content;
    private User author;

    public Post(int id, String content, User author) {
        this.id = id;
        this.content = content;
        this.author = author;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public User getAuthor() {
        return author;
    }

    public void setAuthor(User author) {
        this.author = author;
    }

    @Override
    public String toString() {
        return "Post{id=" + id + ", content='" + content + "', author=" + author.getUsername() + "}";
    }
}