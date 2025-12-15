package org.example;

public class SocialMedia {
    private String platformName;

    public SocialMedia(String platformName) {
        this.platformName = platformName;
    }

    public String getPlatformName() {
        return platformName;
    }

    public void setPlatformName(String platformName) {
        this.platformName = platformName;
    }

    public void publishPost(Post post) {
        System.out.println("This post was published in " + platformName + ": " + post);
    }
}
