package org.example;

public abstract class Content {
    protected int id;
    protected String content;

    public Content(int id, String content) {
        this.id = id;
        this.content = content;
    }

    public abstract String getSummary();

    public int getId() {
        return id;
    }

    public String getContent() {
        return content;
    }
}
