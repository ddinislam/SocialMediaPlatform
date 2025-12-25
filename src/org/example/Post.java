package org.example;

public class Post extends Content {

    private User author;

    public Post(int id, String content, User author) {
        super(id, content);
        this.author = author;
    }

    public User getAuthor() {
        return author;
    }

    @Override
    public String getSummary() {
        return content.length() > 10
                ? content.substring(0, 10) + "..."
                : content;
    }

    @Override
    public String toString() {
        String authorName = (author != null) ? author.getUsername() : "unknown";
        return "Post{id=" + id + ", content='" + content + "', author=" + authorName + "}";
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (!(obj instanceof Post)) return false;
        Post post = (Post) obj;
        return id == post.id;
    }

    @Override
    public int hashCode() {
        return Integer.hashCode(id);
    }
}
